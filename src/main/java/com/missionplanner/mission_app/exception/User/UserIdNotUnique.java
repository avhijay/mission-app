package com.missionplanner.mission_app.exception.User;

public class UserIdNotUnique extends RuntimeException{
    public UserIdNotUnique(String message){
        super(message);
    }
}
