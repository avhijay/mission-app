package com.missionplanner.mission_app.services;

import com.missionplanner.mission_app.DAO.UserDOA;
import com.missionplanner.mission_app.entity.User;
import com.missionplanner.mission_app.respository.UserRespository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    Timestamp now = new Timestamp(System.currentTimeMillis());

    private AccessService accessService;
    private UserDOA userDOA;
   private UserRespository userRespository;
   public UserServiceImpl(AccessService accessService, UserDOA userDOA,UserRespository userRespository){
       this.accessService=accessService;
       this.userDOA =userDOA;
       this.userRespository=userRespository;
   }





    @Override
    public User findByEmpId(String empId) {

        return userDOA.findByIssuedId(empId);
    }

    @Override
    public List<User> findByStatus(String status) {

        return userDOA.findAllByStatus(status);
    }

    @Override
    public List<User> findByName(String name) {

        return userDOA.findByName(name);
    }

    @Override
    public void save(User user) {
        userRespository.save(user);


    }

    @Override
    public void updateStatus(String empId, String newStatus) {
        userDOA.updateUserStatus(empId,newStatus);

    }

    @Override
    public void updateAccessLevel(String empId, int level) {
        userDOA.updateUserAccessLevel(empId,level);

    }

    @Override
    public boolean hasAccessToMission(String empId,   int requiredLevel,String MissionName ){
        User user = userDOA.findByIssuedId(empId);
        if (user.getAccessLevel()>=requiredLevel){
            accessService.log(empId,MissionName,now,"unknown_action",true,"Null");
            return true;
        }else {
            accessService.log(empId,MissionName,now,"unknown_action",false,"Not enough clearance level or invalid Inputs");
            return false;
        }
    }

    @Override
    public boolean hasAdminPrivilege(String empId) {
       int accessLevel=userDOA.getAccessLvl(empId);
       if (accessLevel>=6){
           return true;
       }else return false;
    }
}
