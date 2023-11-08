package com.quickbidd.main.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class Bidding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bid_id;
    private long product_id;
    private long user_id;
    private double bid_amount;
    private Timestamp bid_time;
    private Timestamp created_at;

}