package com.missionplanner.mission_app.entity;

import jakarta.persistence.*;

@Table(name="missions")
@Entity
public class Mission {
    //Adding Fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "Name_of_Mission")
    private String missionName;

    @Column(name = "Location_of_Mission")
    private String location;

    @Column(name="Terrain_of_mission")
    private String terrain;

    @Column(name="Weather_at_location")
    private String weather;

    @Column(name="Duration_of_Mission")
    private Integer duration;

    @Column (name="Mission_Type")
    private String missionType;

    @Column(name = "Equipment_level")
    private String equipmentLevel;

    @Column(name = "operative_name")
    private String operativeName;

    @Column (name= "Budget")
    private  Double Budget;

    @Column (name = "Activity_Status")
    private String status;

    @Column (name="access_Password")
    private String password;

    @Column(name="Allowed_Clearancelevel")
    private String allowedClearanceLevel;

    @Column(name = "Live_Feed_Url")
    private String liveFeedUrl;

    @Column(name = "Is_Live_Enabled")
    private Boolean isLiveEnabled;
//Constructors

    public Mission() {
    }

    public Mission(String location, String missionName, String terrain, String weather, Integer duration, String missionType, String equipmentLevel, String operativeName, Double budget, String status, String password, String allowedClearanceLevel, String liveFeedUrl,  Boolean isLiveEnabled) {
        this.location = location;
        this.missionName = missionName;
        this.terrain = terrain;
        this.weather = weather;
        this.duration = duration;
        this.missionType = missionType;
        this.equipmentLevel = equipmentLevel;
        this.operativeName = operativeName;
        Budget = budget;
        this.status = status;
        this.password = password;
        this.allowedClearanceLevel = allowedClearanceLevel;
        this.liveFeedUrl = liveFeedUrl;
        this.isLiveEnabled = isLiveEnabled;
    }

    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getMissionType() {
        return missionType;
    }

    public void setMissionType(String missionType) {
        this.missionType = missionType;
    }

    public String getEquipmentLevel() {
        return equipmentLevel;
    }

    public void setEquipmentLevel(String equipmentLevel) {
        this.equipmentLevel = equipmentLevel;
    }

    public Double getBudget() {
        return Budget;
    }

    public void setBudget(Double budget) {
        Budget = budget;
    }

    public String getAllowedClearanceLevel() {
        return allowedClearanceLevel;
    }

    public void setAllowedClearanceLevel(String allowedClearanceLevel) {
        this.allowedClearanceLevel = allowedClearanceLevel;
    }

    public Boolean getLiveEnabled() {
        return isLiveEnabled;
    }

    public void setLiveEnabled(Boolean liveEnabled) {
        isLiveEnabled = liveEnabled;
    }

    public String getLiveFeedUrl() {
        return liveFeedUrl;
    }

    public void setLiveFeedUrl(String liveFeedUrl) {
        this.liveFeedUrl = liveFeedUrl;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOperativeName() {
        return operativeName;
    }

    public void setOperativeName(String operativeName) {
        this.operativeName = operativeName;
    }


//TO String


    @Override
    public String toString() {
        return "Mission{" +
                "id=" + id +
                ", missionName='" + missionName + '\'' +
                ", location='" + location + '\'' +
                ", terrain='" + terrain + '\'' +
                ", weather='" + weather + '\'' +
                ", duration=" + duration +
                ", missionType='" + missionType + '\'' +
                ", equipmentLevel='" + equipmentLevel + '\'' +
                ", operativeName='" + operativeName + '\'' +
                ", Budget=" + Budget +
                ", status='" + status + '\'' +
                ", password='" + password + '\'' +
                ", allowedClearanceLevel='" + allowedClearanceLevel + '\'' +
                ", liveFeedUrl='" + liveFeedUrl + '\'' +
                ", isLiveEnabled=" + isLiveEnabled +
                '}';
    }
}
