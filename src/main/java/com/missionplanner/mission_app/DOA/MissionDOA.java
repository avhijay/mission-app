package com.missionplanner.mission_app.DOA;

import com.missionplanner.mission_app.entity.Mission;
import java.util.*;
public interface MissionDOA {
    void save(Mission theMission);

    List<Mission>findMissionByName(String name);

    List<Mission>findMissionByLocation(String location);

    List<Mission>missionStatus(Boolean status);





}
