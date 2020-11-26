package com.example.Dao;

import com.example.Domain.Purchase;
import com.example.Domain.Subscription;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class Dao {

    private EntityManager entityManager;

    @Autowired
    public Dao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public List<Purchase> findAllPurchase(){
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("from Purchase", Purchase.class);
        List<Purchase> purchase = theQuery.getResultList();
        return purchase;
    }


    public List<Subscription> findAllSubscription(){
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("from Subscription", Subscription.class);
        List<Subscription> subscription = theQuery.getResultList();
        return subscription;
    }

    @Transactional
    public void addPurchase(Purchase purchase){
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.save(purchase);
    }

    @Transactional
    public void addSubscription(Subscription subscription){
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.save(subscription);
    }


}
