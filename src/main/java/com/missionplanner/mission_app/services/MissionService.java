package com.missionplanner.mission_app.services;

import com.missionplanner.mission_app.entity.Mission;

import java.util.List;

public interface MissionService {
    Mission save(Mission theMission,String createdBy);

    Mission findMissionByName(String name,String userId);

    List<Mission> findMissionByLocation(String location , String userId);

    List<Mission>findByMissionStatus(Boolean status , String userId);

    Mission findById(int id,String userId);

    void updateMissionStaus(String missionName,String newStatus ,String userId);

    void deleteSingleMission(int id , String userId);

    List<Mission>findAllByUser(String EmpId, String userId);

}
