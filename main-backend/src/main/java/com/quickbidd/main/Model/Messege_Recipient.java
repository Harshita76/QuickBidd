package com.quickbidd.main.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class Messege_Recipient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messege_id;
    private Long recipient_id;
    private String recipient_username;
    private Timestamp messege_time;

    public Messege_Recipient(Long messege_id, Long recipient_id, String recipient_username, Timestamp messege_time) {
        this.messege_id = messege_id;
        this.recipient_id = recipient_id;
        this.recipient_username = recipient_username;
        this.messege_time = messege_time;
    }

    public Messege_Recipient() {
    }

    public Long getMessege_id() {
        return messege_id;
    }

    public void setMessege_id(Long messege_id) {
        this.messege_id = messege_id;
    }

    public Long getRecipient_id() {
        return recipient_id;
    }

    public void setRecipient_id(Long recipient_id) {
        this.recipient_id = recipient_id;
    }

    public String getRecipient_username() {
        return recipient_username;
    }

    public void setRecipient_username(String recipient_username) {
        this.recipient_username = recipient_username;
    }

    public Timestamp getMessege_time() {
        return messege_time;
    }

    public void setMessege_time(Timestamp messege_time) {
        this.messege_time = messege_time;
    }
}
