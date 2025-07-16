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


//Constructors

    public Mission() {
    }

    public Mission(String missionName, String location, String terrain, String weather, Integer duration, String missionType, String equipmentLevel) {
        this.missionName = missionName;
        this.location = location;
        this.terrain = terrain;
        this.weather = weather;
        this.duration = duration;
        this.missionType = missionType;
        this.equipmentLevel = equipmentLevel;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
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


    //TO String


    @Override
    public String toString() {
        return "Mission{" +
                "id=" + id +
                ", missionName='" + missionName + '\'' +
                ", location='" + location + '\'' +
                ", terrain='" + terrain + '\'' +
                ", Weather='" + weather + '\'' +
                ", duration=" + duration +
                ", missionType='" + missionType + '\'' +
                ", equipmentLevel='" + equipmentLevel + '\'' +
                '}';
    }
}
