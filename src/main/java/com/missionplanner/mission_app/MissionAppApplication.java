package com.missionplanner.mission_app;

import com.missionplanner.mission_app.DAO.MissionDOA;
import com.missionplanner.mission_app.DAO.UserDOA;
import com.missionplanner.mission_app.entity.User;
import com.missionplanner.mission_app.respository.MissionRepository;
import com.missionplanner.mission_app.respository.UserRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Timestamp;

@SpringBootApplication
public class MissionAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MissionAppApplication.class, args);
	}

	}







