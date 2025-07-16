package com.missionplanner.mission_app.respository;

import com.missionplanner.mission_app.entity.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission,Integer> {
}
