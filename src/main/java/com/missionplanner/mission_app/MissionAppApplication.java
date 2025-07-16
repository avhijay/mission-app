package com.missionplanner.mission_app;

import com.missionplanner.mission_app.entity.Mission;
import com.missionplanner.mission_app.respository.MissionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MissionAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MissionAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(MissionRepository missionRepository) {
		return output -> {
			Mission mission = new Mission(
					"This is mission name ",
					"This is the location",
					"this is the terrain ",
					"this is the weather",
					89,
					"Kill or capture",
					"EXTREME"
			);
			missionRepository.save(mission);
			System.out.println("Saved mission:  "+mission);

		};


	}
}
