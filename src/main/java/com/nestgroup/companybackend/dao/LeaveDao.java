package com.nestgroup.companybackend.dao;

import com.nestgroup.companybackend.model.LeaveModel;
import org.springframework.data.repository.CrudRepository;

public interface LeaveDao extends CrudRepository<LeaveModel,Integer> {
}
