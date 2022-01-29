package com.gurzelai.reparationscalendar.model;

import javax.persistence.*;

@Entity
//indicates that the Customer class is a JPA entity that should translate into the corresponding table in the database
public class Customer {

    @Id //id of the application
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String firstName;
    @Column
    private String lastName;

    public Customer() {
    }
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return id+" " +firstName+" "+lastName;
    }
}
