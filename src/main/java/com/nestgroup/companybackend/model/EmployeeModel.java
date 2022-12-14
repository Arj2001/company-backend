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
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeModel {

    //employee model
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String emp_code;
    private int age;
    private int salary;
    private String address;
    private String email;
    private String password;


}
