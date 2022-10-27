package com.nestgroup.companybackend.controller;

import com.nestgroup.companybackend.dao.LeaveDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveController {

    @Autowired
    private LeaveDao leaveDao;


}
