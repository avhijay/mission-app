package com.missionplanner.mission_app.exception.Mission;

public class MissionAccessNotAllowed extends RuntimeException{
    public  MissionAccessNotAllowed(String message){
        super(message);
    }
}
