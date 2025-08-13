package com.missionplanner.mission_app.DAO;

import com.missionplanner.mission_app.services.AccessService;
import com.missionplanner.mission_app.entity.Mission;
import com.missionplanner.mission_app.services.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class MissionDOAImpl implements MissionDOA {

    //define field for entity Manager

    private EntityManager entityManager;
    private AccessService accessLog;
    private UserService userService;
Timestamp now  = new Timestamp(System.currentTimeMillis());


    //inject entity manager using constructor injection
@Autowired
    public MissionDOAImpl(EntityManager entityManager , AccessService accesslog , UserService userService ) {
        this.entityManager = entityManager;
        this.accessLog=accesslog;
        this.userService=userService;

    }

    //implement the method

    @Override
    @Transactional
    public void save(Mission theMission) {
        entityManager.persist(theMission);

    }

    @Override
    public Mission findMissionByName (String name) {
        TypedQuery<Mission> myQuery = entityManager.createQuery("FROM Mission WHERE missionName=:theData", Mission.class);
        myQuery.setParameter("theData", name);
        return myQuery.getSingleResult();

    }

    @Override
    public List<Mission> findMissionByLocation(String location) {
        TypedQuery<Mission> theQuery = entityManager.createQuery("FROM Mission WHERE location=:theData", Mission.class);
        theQuery.setParameter("theData", location);
        return theQuery.getResultList();

    }

    @Override
    public List<Mission> findByMissionStatus (Boolean status) {
        TypedQuery<Mission> theQuery = entityManager.createQuery("FROM Mission WHERE isActive=:theData", Mission.class);
        theQuery.setParameter("theData", status);
        return theQuery.getResultList();
    }

    @Override
    public Mission findById(int id) {
      return  entityManager.find(Mission.class,id);

    }
@Transactional
    @Override
    public void updateMissionStaus(String missionName, String newStatus) {
        TypedQuery<Mission> myQuery=entityManager.createQuery("FROM Mission WHERE missionName =:theData",Mission.class);
        myQuery.setParameter("theData",missionName);
        Mission mission =myQuery.getSingleResult();
        mission.setStatus(newStatus);
    }
@Transactional
    @Override
    public void deleteSingleMission(int id) {
      Mission mission =entityManager.find(Mission.class,id);
      if (mission!=null){
          entityManager.remove(mission);
      }else{
          System.out.println("No Mission found");
      }
    }

    @Override
    public List<Mission> findAllByUser(String EmpId) {
        TypedQuery<Mission>myQuery=entityManager.createQuery("FROM Mission WHERE created_by_userid =:theData",Mission.class);
        myQuery.setParameter("theData",EmpId);
       return  myQuery.getResultList();
    }

    @Override
    public Boolean MissionAlreadyExistIgnoreCaseSensitiveSpace(String missionName) {
    // Database data vs User entry data
        //Count gives number of results instead of the data itself
     String jpql = "SELECT COUNT(Mission) FROM Mission Mission " + "WHERE LOWER(REPLACE(Mission.missionName,' ','')) =LOWER(REPLACE(:theData,' ',''))";

     TypedQuery<Long>myQuery=entityManager.createQuery(jpql,Long.class);
     myQuery.setParameter("theData",missionName);
     Long count= myQuery.getSingleResult();
     if (count>0){
         return true;
     }else return false;
    }


}


