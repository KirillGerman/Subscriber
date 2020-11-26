package com.example.RestController;

import com.example.Dao.Dao;
import com.example.Domain.Purchase;
import com.example.Domain.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    private Dao dao;

    @Autowired
    public Controller(Dao dao) {
        this.dao = dao;
    }

    @GetMapping("/purchase")
    public List<Purchase> findAllPurchase(){
        return dao.findAllPurchase();
    }

    @GetMapping("/subscription")
    public List<Subscription> findAllSubscription(){
        return dao.findAllSubscription();
    }


    @PostMapping("/purchase")
    public Purchase addPurchase(@RequestBody Purchase purchase){
        dao.addPurchase(purchase);
        return  purchase;
    }

    @PostMapping("/subscription")
    public Subscription addSubscription(@RequestBody Subscription subscription){
        dao.addSubscription(subscription);
        return  subscription;
    }


}
