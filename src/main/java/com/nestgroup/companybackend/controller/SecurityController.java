package com.nestgroup.companybackend.controller;

import com.nestgroup.companybackend.dao.EmployeeDao;
import com.nestgroup.companybackend.dao.SecurityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @Autowired
    private SecurityDao securityDao;
}
