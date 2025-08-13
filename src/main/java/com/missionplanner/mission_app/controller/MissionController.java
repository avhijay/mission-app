package com.missionplanner.mission_app.controller;

import com.missionplanner.mission_app.DAO.MissionDOA;
import com.missionplanner.mission_app.DAO.UserDOA;
import com.missionplanner.mission_app.entity.Mission;
import com.missionplanner.mission_app.services.MissionService;
import com.missionplanner.mission_app.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/missions")
public class MissionController {


    private UserService userService;
    private MissionService missionService;
    private UserDOA userDOA;
    private MissionDOA missionDOA;

    public MissionController(MissionService missionService,UserService userService,UserDOA userDOA,MissionDOA missionDOA){
        this.userDOA=userDOA;
        this.missionDOA=missionDOA;
        this.missionService=missionService;
        this.userService =userService;
    }

    @PostMapping
    public ResponseEntity<Mission>createMission(
            @RequestBody Mission mission,
            @RequestParam String createdBy
            ){
        Mission  savedMission = missionService.save(mission,createdBy);
        return ResponseEntity.status(HttpStatus.CREATED).header("Location","/api/missions/"+savedMission.getId()).body(savedMission);
    }


}
