package com.missionplanner.mission_app.respository;

import com.missionplanner.mission_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User,Integer> {
}
