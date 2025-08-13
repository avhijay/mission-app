package com.missionplanner.mission_app.DAO;

import com.missionplanner.mission_app.entity.Mission;
import java.util.*;
public interface MissionDOA {
    void save(Mission theMission);

    Mission findMissionByName(String name);

    List<Mission>findMissionByLocation(String location);

    List<Mission>findByMissionStatus(Boolean status);

    Mission findById(int id);

    void updateMissionStaus(String missionName,String newStatus);

    void deleteSingleMission(int id);

    List<Mission>findAllByUser(String EmpId);

    Boolean MissionAlreadyExistIgnoreCaseSensitiveSpace(String missionName);


}
