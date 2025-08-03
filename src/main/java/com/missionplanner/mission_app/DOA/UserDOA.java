package com.missionplanner.mission_app.DOA;

import java.sql.Timestamp;
import java.util.*;
import com.missionplanner.mission_app.entity.User;

public interface UserDOA {
    User findByIssuedId(String empId);

    List<User> findAllByStatus(String status);

    List<User> findByName(String name);

    void updateUserStatus(String empId, String newStatus);

    void updateUserAccessLevel(String empId, int newLevel);

    void updateUserTitle(String empId , String newStatus);

    void setUserTermination(String empId, Timestamp terminatedAt);


}