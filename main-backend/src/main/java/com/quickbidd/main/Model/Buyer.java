package com.quickbidd.main.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class Buyer {
    private long buyer_id;
    private string username;

    public Seller(string username){
        this.username = username;
    }

    public long get_id() {
        return buyer_id;
    }

    public string getUsername() {
        return username;
    }
}