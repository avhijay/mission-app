package com.missionplanner.mission_app.services;

import com.missionplanner.mission_app.DAO.MissionDOA;
import com.missionplanner.mission_app.entity.Mission;
import com.missionplanner.mission_app.exception.Mission.MissionNameNotUnique;
import com.missionplanner.mission_app.respository.MissionRepository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
@Service
public class MissionServiceImpl implements  MissionService{

    private MissionDOA missionDOA;
    private MissionRepository missionRepository;
    private UserService userService;
    private AccessService accessService;
    private Timestamp now = new Timestamp(System.currentTimeMillis());

    public  MissionServiceImpl(MissionDOA missionDOA, UserService userService, AccessService accessService, MissionRepository missionRepository){
        this.accessService=accessService;
        this.missionDOA=missionDOA;
        this.userService=userService;
        this.missionRepository=missionRepository;
    }





    @Override
    public Mission save(Mission theMission, String createdBy) {

if (missionDOA.MissionAlreadyExistIgnoreCaseSensitiveSpace(theMission.getMissionName())){
    throw new MissionNameNotUnique("Mission with the particular name already exist : "+theMission.getMissionName());
}
missionDOA.save(theMission);
 String name = theMission.getMissionName();
        System.out.println("Saving Mission by : User--"+createdBy);
accessService.log(createdBy,name,now,"Creating Mission :"+name,true,null);
return theMission;

   }

    @Override
    public Mission findMissionByName(String name, String userId) {
        return null;
    }

    @Override
    public List<Mission> findMissionByLocation(String location, String userId) {
        return List.of();
    }

    @Override
    public List<Mission> findByMissionStatus(Boolean status, String userId) {
        return List.of();
    }

    @Override
    public Mission findById(int id, String userId) {
        return null;
    }

    @Override
    public void updateMissionStaus(String missionName, String newStatus, String userId) {

    }

    @Override
    public void deleteSingleMission(int id, String userId) {

    }

    @Override
    public List<Mission> findAllByUser(String EmpId, String userId) {
        return List.of();
    }
}
