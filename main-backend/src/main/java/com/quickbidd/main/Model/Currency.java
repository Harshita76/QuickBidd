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
    private Timestamp created_at;
    private Timestamp updated_at;

    public Currency() {
    }

    public Currency(long currency_id, double currency_data, Timestamp created_at, Timestamp updated_at) {
        this.currency_id = currency_id;
        this.currency_data = currency_data;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public long getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(long currency_id) {
        this.currency_id = currency_id;
    }

    public double getCurrency_data() {
        return currency_data;
    }

    public void setCurrency_data(double currency_data) {
        this.currency_data = currency_data;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}