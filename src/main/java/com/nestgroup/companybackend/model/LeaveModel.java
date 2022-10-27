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
@Table(name = "leaves")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LeaveModel {

    @Id
    @GeneratedValue
    private int id;

    private String type;
    private int emp_id;
    private String applyDate;
    private String leaveDate;
    private int Status;
}
