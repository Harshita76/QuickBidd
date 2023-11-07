package com.quickbidd.main.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long currency_id;
    private double currency_data;
    private timestamp created_at;
    private timestamp updated_at;


    public Currency(double currency_data){
        this.currency_data = currency_data;
    }

    public void setCurrency_id(long currency_id) {
        this.currency_id = currency_id;
    }

    public double getCurrency_data() {
        return currency_data;
    }

    public timestamp getCreated_at() {
        return created_at;
    }

    public timestamp getUpdated_at() {
        return updated_at;
    }

    public void setCurrency_data(double currency_data) {
        this.currency_data = currency_data;
    }
}