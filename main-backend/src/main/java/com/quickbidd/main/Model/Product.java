package com.quickbidd.main.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
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

    public Product() {
    }

    public Product(Long product_id, String product_name, Long seller_id, String category, String desc, double starting_bid_amount, double current_bid_amount, Timestamp bidding_start_time, Timestamp bidding_end_time, Timestamp created_at, Timestamp deleted_at, boolean is_sold, boolean is_active) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.seller_id = seller_id;
        this.category = category;
        this.desc = desc;
        this.starting_bid_amount = starting_bid_amount;
        this.current_bid_amount = current_bid_amount;
        this.bidding_start_time = bidding_start_time;
        this.bidding_end_time = bidding_end_time;
        this.created_at = created_at;
        this.deleted_at = deleted_at;
        this.is_sold = is_sold;
        this.is_active = is_active;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Long getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(Long seller_id) {
        this.seller_id = seller_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getStarting_bid_amount() {
        return starting_bid_amount;
    }

    public void setStarting_bid_amount(double starting_bid_amount) {
        this.starting_bid_amount = starting_bid_amount;
    }

    public double getCurrent_bid_amount() {
        return current_bid_amount;
    }

    public void setCurrent_bid_amount(double current_bid_amount) {
        this.current_bid_amount = current_bid_amount;
    }

    public Timestamp getBidding_start_time() {
        return bidding_start_time;
    }

    public void setBidding_start_time(Timestamp bidding_start_time) {
        this.bidding_start_time = bidding_start_time;
    }

    public Timestamp getBidding_end_time() {
        return bidding_end_time;
    }

    public void setBidding_end_time(Timestamp bidding_end_time) {
        this.bidding_end_time = bidding_end_time;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Timestamp deleted_at) {
        this.deleted_at = deleted_at;
    }

    public boolean isIs_sold() {
        return is_sold;
    }

    public void setIs_sold(boolean is_sold) {
        this.is_sold = is_sold;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }
}
