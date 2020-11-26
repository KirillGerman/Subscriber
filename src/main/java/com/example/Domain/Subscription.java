package com.example.Domain;



import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="subscription")
public class Subscription {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "msisdn")
    private int msisdn;
    @Column(name = "action")
    private String action;
    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    public Subscription(int id, int msisdn, String action, LocalDateTime timestamp) {
        this.id = id;
        this.msisdn = msisdn;
        this.action = action;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(int msisdn) {
        this.msisdn = msisdn;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
