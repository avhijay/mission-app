package com.missionplanner.mission_app.entity;

import jakarta.persistence.*;

@Table(name ="users")
@Entity

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String password;

    @Column(name = "clearence_level")
    private int acessLevel;

    @Column(name = "issued_id")
    private int issuedID;

    @Column(name = "employment_status")
    private String employmentStatus;

    //constructor
    public Users() {
    }

    public Users(String userName, String password, int acessLevel, int issuedID, String employmentStatus) {
        this.userName = userName;
        this.password = password;
        this.acessLevel = acessLevel;
        this.issuedID = issuedID;
        this.employmentStatus = employmentStatus;
    }


//getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAcessLevel() {
        return acessLevel;
    }

    public void setAcessLevel(int acessLevel) {
        this.acessLevel = acessLevel;
    }

    public int getIssuedID() {
        return issuedID;
    }

    public void setIssuedID(int issuedID) {
        this.issuedID = issuedID;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }


// to string


    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", acessLevel=" + acessLevel +
                ", issuedID=" + issuedID +
                ", employmentStatus='" + employmentStatus + '\'' +
                '}';
    }
}
