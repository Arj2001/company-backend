package com.nestgroup.companybackend.dao;

import com.nestgroup.companybackend.model.EmployeeModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {

    @Query(value = "SELECT * FROM `employees` WHERE name = :name OR id = :id",nativeQuery = true)
    public List<EmployeeModel> searchEmployee(String name,int id);
}
