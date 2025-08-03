package com.missionplanner.mission_app.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Table(name = "USERS")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column(name = "name_of_employee")
    private String nameOfEmployee;

    @Column(name = "password_hash")
    private String passwordHash;

    @Column(name = "access_level")
    private int accessLevel;

    @Column(name = "employment_status")
    private String employmentStatus;

    @Column(name = "employment_id")
    private String employmentId;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "terminated_at")
    private Timestamp terminatedAt;

    @Column(name = "title")
    private String title;



    //constructor
    public  User(){}

    public User(String nameOfEmployee, String passwordHash, int accessLevel, String employmentStatus, String employmentId, Timestamp createdAt, Timestamp updatedAt, Timestamp terminatedAt, String title) {
        this.nameOfEmployee = nameOfEmployee;
        this.passwordHash = passwordHash;
        this.accessLevel = accessLevel;
        this.employmentStatus = employmentStatus;
        this.employmentId = employmentId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.terminatedAt = terminatedAt;
        this.title = title;
    }
    //getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getEmploymentId() {
        return employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getTerminatedAt() {
        return terminatedAt;
    }

    public void setTerminatedAt(Timestamp terminatedAt) {
        this.terminatedAt = terminatedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    // to string


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nameOfEmployee='" + nameOfEmployee + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", accessLevel=" + accessLevel +
                ", employmentStatus='" + employmentStatus + '\'' +
                ", employmentId='" + employmentId + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", terminatedAt=" + terminatedAt +
                ", title='" + title + '\'' +
                '}';
    }
}
