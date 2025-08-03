package com.missionplanner.mission_app;

import com.missionplanner.mission_app.DOA.MissionDOA;
import com.missionplanner.mission_app.entity.Mission;
import com.missionplanner.mission_app.respository.MissionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MissionAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MissionAppApplication.class, args);
	}

	// password encryption



	@Bean
	public CommandLineRunner commandLineRunner(MissionRepository missionRepository, MissionDOA missionDOA) {
		return output -> {
		//	saveMission(missionRepository);
		//	queryForSearchByName(missionDOA);
		//findingMissionByLocation(missionDOA);
		//	statusOfMission(missionDOA);

			//removeMissionByIndx(missionDOA);


	//WARNING
//deleteAllData(missionRepository);
		};
	}

	private void removeMissionByIndx(MissionDOA missionDOA) {
		missionDOA.deleteSingleMission(2);
	}

	private void statusOfMission(MissionDOA missionDOA) {
		List<Mission> missions=missionDOA.missionStatus(true);
		for (Mission tempmission2 :missions){
			System.out.println(tempmission2);
		}
	}

	private void findingMissionByLocation(MissionDOA missionDOA) {
		List<Mission> missions=missionDOA.findMissionByLocation("Kashmir");
		for (Mission Wmissions:missions){
			System.out.println(Wmissions);
		}
	}

	private void deleteAllData(MissionRepository missionRepository) {
		missionRepository.deleteAll();
		System.out.println("Deleting data");
	}

	private void queryForSearchByName(MissionDOA missionDOA) {
		List<Mission> theMission=missionDOA.findMissionByName("Jinx");
		// displaying the data
		for (Mission tempmission : theMission){
			System.out.println(tempmission);
		}

	}

	private void saveMission(MissionRepository missionRepository) {
		Mission mission1= new Mission("UNKNOWN","Combat5","SAND","extreme Heat waves",900,"Combat","Hard","name1, name 2, name 3, name 4",782272.000,"active","SECUREDPASSWORD","1 STAR"," Available",true);
		System.out.println("Saving new mission");
		missionRepository.save(mission1);
	}
}


