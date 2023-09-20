package com.prakash.userservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotEmpty
    @Size(min=5, max = 30, message = "between 5-30 char")

    private String name;
    @NotBlank
    private String city;
    @Column(unique = true)
    @Email
    private String email;
    private String mobile;
    @JsonIgnore
    private String password;
    @JsonIgnore
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    private Date createdDate = new Date ();
    @JsonIgnore
    @Temporal(TemporalType.DATE)
    private Date updatedDate = new Date ();
    @JsonIgnore
    private int age;
    @JsonIgnore
    private String gender;
    @JsonIgnore
    private String image;
    @JsonIgnore
    private String otp;
    @JsonIgnore
    private String designation;
    @JsonIgnore
    private Long roleId;


}
