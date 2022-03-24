package com.example.api_child.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Child")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    Long familyId;

    private String lastname;

    private String firstname;

    private String role;

    public Long getId() {
        return id;
    }

    public Long getFamilyId() {
        return familyId;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getRole() {
        return role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
