package com.crm.crm.model;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;

public class Contact {

    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String email;

    private Contact(){}

    public Contact(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
