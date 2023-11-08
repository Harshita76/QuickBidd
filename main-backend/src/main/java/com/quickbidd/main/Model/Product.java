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
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;
    private String product_name;
    private Long seller_id;
    private String category;
    private String desc;
    private double starting_bid_amount;
    private double current_bid_amount;
    private Timestamp bidding_start_time;
    private Timestamp bidding_end_time;
    private Timestamp created_at;
    private Timestamp deleted_at;
    private boolean is_sold;
    private boolean is_active;


}
