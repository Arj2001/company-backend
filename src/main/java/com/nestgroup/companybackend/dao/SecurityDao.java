package com.nestgroup.companybackend.dao;

import com.nestgroup.companybackend.model.SecurityModel;
import com.nestgroup.companybackend.model.SecurityModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SecurityDao extends CrudRepository<SecurityModel,Integer> {

    @Query(value = "SELECT * FROM `securities` WHERE name = :name OR id = :id",nativeQuery = true)
    public List<SecurityModel> searchSecurity(String name, int id);

    @Query(value = "SELECT * FROM `securities` WHERE email = :email AND password = :password",nativeQuery = true)
    public List<SecurityModel> authenticateSecurity(String email,String password);

    @Modifying
    @Query(value = "UPDATE `securities` SET address=:address,age=:age,email=:email,name=:name,password=:password,salary=:salary,phone=:phone WHERE id = :id",nativeQuery = true)
    public void editSecurity(String address,int age,String email,String name,String password,int salary,String phone,int id);
}
