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
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long buyer_id;
    private String username;

}