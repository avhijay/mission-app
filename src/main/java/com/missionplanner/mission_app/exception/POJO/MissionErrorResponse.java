package com.missionplanner.mission_app.exception.POJO;

import java.time.LocalDateTime;

public class MissionErrorResponse {
    private  int status;
    private String message;
    private LocalDateTime time;

   public MissionErrorResponse(){}

    public MissionErrorResponse(int status, String message, LocalDateTime time) {
        this.status = status;
        this.message = message;
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
