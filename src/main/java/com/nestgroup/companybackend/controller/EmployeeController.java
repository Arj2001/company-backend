package com.nestgroup.companybackend.controller;


import com.nestgroup.companybackend.dao.EmployeeDao;
import com.nestgroup.companybackend.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    //Employee details adding api
    @CrossOrigin(origins = "*")
    @PostMapping("/addEmp")
    public String addEmployee(@RequestBody EmployeeModel employeeModel){
        employeeDao.save(employeeModel);
        return "Success";
    }

    //Employee delete by id;
    @CrossOrigin(origins = "*")
    @PostMapping("/deleteEmp")
    public String deleteEmployee(@RequestBody EmployeeModel employeeModel){
        employeeDao.deleteById(employeeModel.getId());
        return "Success";
    }

    //Search employee name

}
