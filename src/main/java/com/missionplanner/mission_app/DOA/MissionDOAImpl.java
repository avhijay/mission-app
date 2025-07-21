package com.missionplanner.mission_app.DOA;

import com.missionplanner.mission_app.entity.Mission;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.hibernate.boot.model.source.internal.hbm.AttributesHelper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class MissionDOAImpl implements MissionDOA {

    //define field for entity Manager

    private EntityManager entityManager;

    //inject entity manager using constructor injection

    public MissionDOAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;

    }

    //implement the method

    @Override
    @Transactional
    public void save(Mission theMission) {
        entityManager.persist(theMission);

    }

    @Override
    public List<Mission> findMissionByName(String name) {
        TypedQuery<Mission> myQuery = entityManager.createQuery("FROM Mission WHERE missionName=:theData", Mission.class);

        myQuery.setParameter("theData", name);

        return myQuery.getResultList();
    }

    @Override
    public List<Mission> findMissionByLocation(String location) {
        TypedQuery<Mission> theQuery = entityManager.createQuery("FROM Mission WHERE location=:theData", Mission.class);
        theQuery.setParameter("theData", location);
        return theQuery.getResultList();

    }

    @Override
    public List<Mission> missionStatus (Boolean status) {
        TypedQuery<Mission> theQuery = entityManager.createQuery("FROM Mission WHERE isActive=:theData", Mission.class);
        theQuery.setParameter("theData", status);
        return theQuery.getResultList();
    }


}


