package com.askMeNew.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "App_users")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    @NaturalId(mutable = true)
    @Column(name = "EMAIL", nullable = false)
    private String email;
    private String phoneNumber;
    private String password;
    private String username;
    private String speciality;
    private String qualification;
    private String authorities;


    private boolean isEnabled = false;
    private boolean mfaEnabled;
    private String secret;








}
