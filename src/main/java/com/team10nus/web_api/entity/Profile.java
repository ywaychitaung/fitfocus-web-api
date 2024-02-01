package com.team10nus.web_api.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name="profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Profile_id")
    private int profileId;

    @Column(name="Gender")
    private String gender;

    @Column(name="Date_of_birth")
    private int date_of_birth;

    @Column(name="Country")
    private String country;

    @OneToOne
    @JsonManagedReference
    private User user;

    public Profile() {}

    public Profile(String gender, int date_of_birth,String country )
    {
        this.gender=gender;
        this.country=country;
        this.date_of_birth=date_of_birth;
    }

    public Integer getProfileId()
    {
        return profileId;
    }

    public void setProfileId(int profileId)
    {
        this.profileId=profileId;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender=gender;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country=country;
    }

    public int getDateOfBirth()
    {
        return date_of_birth;
    }
    public void setDateOfBirth(int date_of_birth)
    {
        this.date_of_birth=date_of_birth;
    }

}

     









