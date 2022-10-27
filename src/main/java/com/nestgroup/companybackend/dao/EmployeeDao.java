package com.nestgroup.companybackend.dao;

import com.nestgroup.companybackend.model.EmployeeModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {

    @Query(value = "SELECT * FROM `employees` WHERE name = :name OR id = :id",nativeQuery = true)
    public List<EmployeeModel> searchEmployee(String name,int id);

    @Query(value = "SELECT * FROM `employees` WHERE email = :email AND password = :password",nativeQuery = true)
    public List<EmployeeModel> authenticateEmployee(String email,String password);

    @Modifying
    @Query(value = "UPDATE `employees` SET address=:address,age=:age,email=:email,name=:name,password=:password,salary=:salary,phone=:phone,designation = :designation WHERE id = :id",nativeQuery = true)
    public void editEmployee(String address,int age,String email,String name,String password,int salary,String phone,int id,String designation);

}
