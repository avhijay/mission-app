package com.missionplanner.mission_app.services;

import com.missionplanner.mission_app.entity.User;

import java.util.List;

public interface UserService {

    User findByEmpId(String empId);
    List<User> findByStatus(String status);
    List<User> findByName(String name);
    void save(User user);
    void updateStatus(String empId, String newStatus);
    void updateAccessLevel(String empId, int level);
    boolean hasAccessToMission(String empId, int requiredLevel,String MissionName);
    boolean hasAdminPrivilege(String empId);
}