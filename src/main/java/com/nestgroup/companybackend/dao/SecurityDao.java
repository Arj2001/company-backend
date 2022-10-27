package com.nestgroup.companybackend.dao;

import com.nestgroup.companybackend.model.SecurityModel;
import org.springframework.data.repository.CrudRepository;

public interface SecurityDao extends CrudRepository<SecurityModel,Integer> {
}
