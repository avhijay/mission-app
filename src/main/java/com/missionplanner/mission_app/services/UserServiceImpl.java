package com.missionplanner.mission_app.services;

import com.missionplanner.mission_app.DOA.UserDOA;
import com.missionplanner.mission_app.entity.User;
import com.missionplanner.mission_app.respository.UserRespository;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDOA userDOA;
    public UserServiceImpl(UserDOA userDOA1){
        this.userDOA=userDOA1;
    }
   private UserRespository userRespository;
    public  UserServiceImpl(UserRespository userRespository){
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
    public boolean hasAccessToMission(String empId, int requiredLevel) {
        User user = userDOA.findByIssuedId(empId);
        if (user.getAccessLevel()>=requiredLevel){
            return true;
        }else {
            return false;
        }
    }


}