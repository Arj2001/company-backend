package com.nestgroup.companybackend.controller;


import com.nestgroup.companybackend.dao.EmployeeDao;
import com.nestgroup.companybackend.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    //Employee details adding api
    @CrossOrigin(origins = "*")
    @PostMapping("/addEmp")
    public String addEmployee(@RequestBody EmployeeModel employeeModel){
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        employeeModel.setJoiningDate(String.valueOf(date.format(now)));
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

    //View All Employees
    @CrossOrigin(origins = "*")
    @GetMapping("/viewEmp")
    public List<EmployeeModel> searchEmployee(){
        return (List<EmployeeModel>) employeeDao.findAll();
    }


    //Search employee by name and id
    @CrossOrigin(origins = "*")
    @PostMapping("/searchEmp")
    public List<EmployeeModel> searchEmployee(@RequestBody EmployeeModel employeeModel){
        return (List<EmployeeModel>) employeeDao.searchEmployee(employeeModel.getName(), employeeModel.getId());
    }

    //Authentication of employee
    @CrossOrigin(origins = "*")
    @PostMapping("/authEmp")
    public List<EmployeeModel> authenticateEmployee(@RequestBody EmployeeModel employeeModel){
        return (List<EmployeeModel>) employeeDao.authenticateEmployee(employeeModel.getEmail(), employeeModel.getPassword());
    }

    //Update employee details
    @Transactional
    @CrossOrigin(origins = "*")
    @PostMapping("/updateEmp")
    public String editEmployee(@RequestBody EmployeeModel employeeModel){

        employeeDao.editEmployee(employeeModel.getAddress(), employeeModel.getAge(), employeeModel.getEmail(),
                employeeModel.getName(), employeeModel.getPassword(),
                employeeModel.getSalary(),employeeModel.getPhone(), employeeModel.getId(),employeeModel.getDesignation());
        return "Success";
    }

}
