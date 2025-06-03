package com.example.organdonation.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity

public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "donor_id")
    private int id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "organ", nullable = false)
    private String organ;

    @Column(name = "blood_group", nullable = false)
    private String bloodGroup;

   
    private String address;

   
    private String message;

   
    private LocalDateTime registrationDate;

    // Constructors
    public Donor() {}

    public Donor(String fullName, String email, String phone, int age, String gender, String organ, String bloodGroup,
                 String address, String message, LocalDateTime registrationDate) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.organ = organ;
        this.bloodGroup = bloodGroup;
        this.address = address;
        this.message = message;
        this.registrationDate = registrationDate;
    }

    // Getters & Setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getOrgan() { return organ; }
    public void setOrgan(String organ) { this.organ = organ; }

    public String getBloodGroup() { return bloodGroup; }
    public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public LocalDateTime getRegistrationDate() { return registrationDate; }
    public void setRegistrationDate(LocalDateTime registrationDate) { this.registrationDate = registrationDate; }
}
