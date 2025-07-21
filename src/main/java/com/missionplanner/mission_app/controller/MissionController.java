package com.missionplanner.mission_app.controller;

import com.missionplanner.mission_app.entity.Mission;
import com.missionplanner.mission_app.respository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/missions")
public class MissionController {
    private final MissionRepository missionRepository;
    @Autowired
    public MissionController(MissionRepository missionRepository){
        this.missionRepository=missionRepository;
    }



    @GetMapping("/AllMissions")
    public List<Mission>getAllMission(){
        return missionRepository.findAll();
    }
}
