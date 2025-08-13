package com.missionplanner.mission_app.AccessLog;

import com.missionplanner.mission_app.entity.Access;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Table;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
@Repository
public class AccessDOAImpl implements AccessDOA{


    private EntityManager entityManager;
    public  AccessDOAImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }


    @Override
    @Transactional
    public void saveLog(Access access) {
        entityManager.persist(access);
    }
}

