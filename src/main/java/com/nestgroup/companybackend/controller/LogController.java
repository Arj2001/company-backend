package com.nestgroup.companybackend.controller;

import com.nestgroup.companybackend.dao.LogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @Autowired
    private LogDao logDao;
}
