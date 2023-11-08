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
public class Messege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messege_id;
    private Long sender_id;
    private Long product_id;
    private String messege_data;
    private Timestamp messege_time;
    private String sender_username;
    private Timestamp created_at;
    private Timestamp updated_at;


}
