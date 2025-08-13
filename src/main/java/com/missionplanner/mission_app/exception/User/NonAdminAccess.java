package com.missionplanner.mission_app.exception.User;

public class NonAdminAccess extends RuntimeException{
    public NonAdminAccess(String message){
        super(message);
    }
}
