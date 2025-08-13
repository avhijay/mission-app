package com.missionplanner.mission_app.respository;

import com.missionplanner.mission_app.entity.Access;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcessRespository extends JpaRepository<Access,Integer> {

}
