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
public class Messege_Recipient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messege_id;
    private Long recipient_id;
    private String recipient_username;
    private Timestamp messege_time;

}
