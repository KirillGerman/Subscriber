package com.example.Dao;

import com.example.Domain.Subscription;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MessageRepository  extends CrudRepository<Subscription, Long> {


    public List<Subscription> findAll();

    public Subscription findById(int theId);

    public Subscription save(Subscription theEmployee);

    public void deleteById(int theId);
}
