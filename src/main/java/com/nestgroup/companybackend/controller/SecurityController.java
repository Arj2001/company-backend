package com.nestgroup.companybackend.controller;

import com.nestgroup.companybackend.dao.SecurityDao;
import com.nestgroup.companybackend.model.SecurityModel;
import com.nestgroup.companybackend.model.SecurityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController

public class SecurityController {

    @Autowired
    private SecurityDao securityDao;



    //Security details adding api
    @CrossOrigin(origins = "*")
    @PostMapping("/addSec")
    public String addSecurity(@RequestBody SecurityModel securityModel){
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        securityModel.setDoj(String.valueOf(date.format(now)));
        securityDao.save(securityModel);
        return "Success";
    }

    //Security delete by id;
    @CrossOrigin(origins = "*")
    @PostMapping("/deleteSec")
    public String deleteSecurity(@RequestBody SecurityModel securityModel){
        securityDao.deleteById(securityModel.getId());
        return "Success";
    }

    //View All Secuirty
    @CrossOrigin(origins = "*")
    @GetMapping("/viewSec")
    public List<SecurityModel> searchSecurity(){
        return (List<SecurityModel>) securityDao.findAll();
    }


    //Search security by name and id
    @CrossOrigin(origins = "*")
    @PostMapping("/searchSec")
    public List<SecurityModel> searchSecurity(@RequestBody SecurityModel securityModel){
        return (List<SecurityModel>) securityDao.searchSecurity(securityModel.getName(), securityModel.getId());
    }

    //Authentication of security
    @CrossOrigin(origins = "*")
    @PostMapping("/authSec")
    public List<SecurityModel> authenticateSecurity(@RequestBody SecurityModel securityModel){
        return (List<SecurityModel>) securityDao.authenticateSecurity(securityModel.getEmail(), securityModel.getPassword());
    }

    //Update security details
    @Transactional
    @CrossOrigin(origins = "*")
    @PostMapping("/updateSec")
    public String editSecurity(@RequestBody SecurityModel securityModel){

        securityDao.editSecurity(securityModel.getAddress(), securityModel.getAge(), securityModel.getEmail(),
                securityModel.getName(), securityModel.getPassword(),
                securityModel.getSalary(),securityModel.getPhone(), securityModel.getId());
        return "Success";
    }
}
