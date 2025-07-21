package com.missionplanner.mission_app.DOA;

import com.missionplanner.mission_app.entity.Users;

import java.util.List;

public interface UserDOA {

    List< Users>findByIssuedId(int given_id );
    void deleteByIssuedId(int id);
    List<Users>findByName(String name);
    List<Users>employeeStatus(String status);
}
