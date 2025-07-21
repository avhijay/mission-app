package com.missionplanner.mission_app.services;

import com.missionplanner.mission_app.entity.Users;

import java.util.List;

public interface UserService {
    Users findById(int id);

    List<Users>findAll();

    void saveUser(Users users);

    void deleteById(int id);

    List<Users> findByName(String name );

    Boolean hasAccessToMission(int userId, int missionClearanceLevel);
}
