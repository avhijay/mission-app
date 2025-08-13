package com.missionplanner.mission_app.services;

import com.missionplanner.mission_app.AccessLog.AccessDOA;
import com.missionplanner.mission_app.entity.Access;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;


@Service
public class AccessService {

    private final AccessDOA accessDOA;
    public AccessService(AccessDOA accessDOA){
        this.accessDOA= accessDOA;
    }

    // log method

    public void  log(String userId, String missionName, Timestamp accessTime,
                     String action, Boolean accessStatus, String failureReason){

        Access access=new Access();
        access.setAccessStatus(accessStatus);
        access.setAccessTime(accessTime);
        access.setMissionName(missionName);
        access.setAction(action);
        access.setUserId(userId);
        access.setFailureReason(failureReason);

        accessDOA.saveLog(access);

    }
}
