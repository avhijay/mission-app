package com.missionplanner.mission_app.respository;

import com.missionplanner.mission_app.entity.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepository extends JpaRepository<Mission,Integer> {
}
