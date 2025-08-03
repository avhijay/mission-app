package com.missionplanner.mission_app.DOA;

import com.missionplanner.mission_app.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

public class UserDOAImpl implements UserDOA{

    private EntityManager entityManager;
    public UserDOAImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }


    @Override
    public  User findByIssuedId(String Empid) {
        TypedQuery<User> myQuery=entityManager.createQuery("FROM User WHERE employmentId =:theData",User.class);
        myQuery.setParameter("theData",Empid);
        return myQuery.getSingleResult();
    }

    @Override
    public List<User> findAllByStatus(String status) {
        TypedQuery<User> myQuery = entityManager.createQuery("FROM USER WHERE employmentStatus =:theData", User.class);
        myQuery.setParameter("theData",status);
        return myQuery.getResultList();
    }

    @Override
    public List<User> findByName(String name) {
        TypedQuery<User> myQuery = entityManager.createQuery("FROM USER WHERE nameOfEmployee =:theData", User.class);
        myQuery.setParameter("theData",name);
        return myQuery.getResultList();
    }





    @Override
    public void updateUserStatus(String empId, String newStatus) {

        TypedQuery<User> myquery = entityManager.createQuery("FROM User WHERE employmentId =:theData", User.class);
        myquery.setParameter("theData", empId);
        User user = myquery.getSingleResult();
        user.setEmploymentStatus(newStatus);

    }

    @Override
    public void updateUserAccessLevel(String empId, int newLevel) {

        TypedQuery<User> myQuery = entityManager.createQuery("FROM User WHERE employementId =:theData",User.class);
        myQuery.setParameter("theData",empId);
        User user = myQuery.getSingleResult();
        user.setAccessLevel(newLevel);

    }

    @Override
    public void updateUserTitle(String empId, String newStatus) {
        TypedQuery<User> myQuery = entityManager.createQuery("FROM User WHERE employementId =:theData",User.class);
        myQuery.setParameter("theData",empId);
        User user = myQuery.getSingleResult();
        user.setTitle(newStatus);


    }

    @Override
    public void setUserTermination(String empId, Timestamp terminatedAt) {
        TypedQuery<User> myQuery = entityManager.createQuery("FROM User WHERE employementId =:theData",User.class);
        myQuery.setParameter("theData",empId);
        User user = myQuery.getSingleResult();
        user.setTerminatedAt(terminatedAt);

    }


}


//@Override
//public Boolean hasAccessToMission(int userId, int missionClearanceLevel) {
//    Users user = userRepository.findById(userId).orElse(null);
//    if (user == null) {
//        return false;
//    }
//
//    return user.getAcessLevel() >= missionClearanceLevel;
//}
