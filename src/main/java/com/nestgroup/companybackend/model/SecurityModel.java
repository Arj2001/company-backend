package com.nestgroup.companybackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "securities")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SecurityModel {

    @Id
    @GeneratedValue
    private  int id;

    private String name;
    private int age;
    private String phone;
    private String email;
    private String password;
    private String address;
    private int salary;
    private String doj;


}
