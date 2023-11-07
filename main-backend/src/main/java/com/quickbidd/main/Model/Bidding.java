package com.quickbidd.main.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class Bidding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bid_id;
    private long product_id;
    private long user_id;
    private double bid_amount;
    private Timestamp bid_time;
    private Timestamp created_at;

    public Bidding() {
    }

    public Bidding(long bid_id, long product_id, long user_id, double bid_amount, Timestamp bid_time, Timestamp created_at) {
        this.bid_id = bid_id;
        this.product_id = product_id;
        this.user_id = user_id;
        this.bid_amount = bid_amount;
        this.bid_time = bid_time;
        this.created_at = created_at;
    }

    public long getBid_id() {
        return bid_id;
    }

    public void setBid_id(long bid_id) {
        this.bid_id = bid_id;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public double getBid_amount() {
        return bid_amount;
    }

    public void setBid_amount(double bid_amount) {
        this.bid_amount = bid_amount;
    }

    public Timestamp getBid_time() {
        return bid_time;
    }

    public void setBid_time(Timestamp bid_time) {
        this.bid_time = bid_time;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
}