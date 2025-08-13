package com.missionplanner.mission_app.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;


@Table(name = "mission_access_logs")
    @Entity
    public class Access {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

        @Column(name = "user_id")
    private  String userId;

        @Column(name = "name_of_Mission")
    private String missionName;

        @Column(name = "access_time")
    private Timestamp accessTime;

        @Column(name = "action")
    private String action;

@Column(name = "access_granted")
private Boolean AccessStatus;

@Column(name = "failed_reason")
private String failureReason;

      //constructors
public Access(){}


    public Access(String userId, String missionName, Timestamp accessTime, String action, Boolean accessStatus, String failureReason) {
        this.userId = userId;
        this.missionName = missionName;
        this.accessTime = accessTime;
        this.action = action;
        AccessStatus = accessStatus;
        this.failureReason = failureReason;
    }

  //getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public Timestamp getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Timestamp accessTime) {
        this.accessTime = accessTime;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Boolean getAccessStatus() {
        return AccessStatus;
    }
    public void setAccessStatus(Boolean accessStatus) {
        AccessStatus = accessStatus;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }


    // to string


    @Override
    public String toString() {
        return "Access{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", missionName='" + missionName + '\'' +
                ", accessTime=" + accessTime +
                ", action='" + action + '\'' +
                ", AccessStatus=" + AccessStatus +
                ", failureReason='" + failureReason + '\'' +
                '}';
    }
}
