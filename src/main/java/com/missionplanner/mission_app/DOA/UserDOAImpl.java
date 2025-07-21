package com.missionplanner.mission_app.DOA;

import com.missionplanner.mission_app.entity.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class UserDOAImpl implements UserDOA{

    private final EntityManager entityManager;

    public UserDOAImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }


    @Override
    public List  <Users> findByIssuedId(int id) {
        TypedQuery<Users> myQuery= entityManager.createQuery("FROM Users WHERE issuedId=:theData",Users.class);
        myQuery.setParameter("theData",id);

        return myQuery.getResultList();
    }




    @Override
    public void deleteByIssuedId(int id) {
Users deleteUser=entityManager.find(Users.class,id);
if (deleteUser!=null){
    entityManager.remove(deleteUser);
}

    }

    @Override
    public List<Users> findByName(String name) {
        TypedQuery<Users> myQuery=entityManager.createQuery("FROM Users WHERE userName=:theData",Users.class);
        myQuery.setParameter("theData",name);
        return myQuery.getResultList();
    }

    @Override
    public List<Users> employeeStatus(String status) {
        TypedQuery<Users> myQuery=entityManager.createQuery("FROM Users WHERE employmentStatus=:theData",Users.class);
        myQuery.setParameter("theData",status);
        return myQuery.getResultList();
    }
}
