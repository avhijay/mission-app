package com.missionplanner.mission_app.AccessLog;

import com.missionplanner.mission_app.entity.Access;

import java.sql.Timestamp;

public interface AccessDOA {
    void saveLog(Access access);

}
