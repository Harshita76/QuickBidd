package com.quickbidd.main.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
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

    public Messege() {
    }

    public Messege(Long messege_id, Long sender_id, Long product_id, String messege_data, Timestamp messege_time, String sender_username, Timestamp created_at, Timestamp updated_at) {
        this.messege_id = messege_id;
        this.sender_id = sender_id;
        this.product_id = product_id;
        this.messege_data = messege_data;
        this.messege_time = messege_time;
        this.sender_username = sender_username;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Long getMessege_id() {
        return messege_id;
    }

    public void setMessege_id(Long messege_id) {
        this.messege_id = messege_id;
    }

    public Long getSender_id() {
        return sender_id;
    }

    public void setSender_id(Long sender_id) {
        this.sender_id = sender_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getMessege_data() {
        return messege_data;
    }

    public void setMessege_data(String messege_data) {
        this.messege_data = messege_data;
    }

    public Timestamp getMessege_time() {
        return messege_time;
    }

    public void setMessege_time(Timestamp messege_time) {
        this.messege_time = messege_time;
    }

    public String getSender_username() {
        return sender_username;
    }

    public void setSender_username(String sender_username) {
        this.sender_username = sender_username;
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
