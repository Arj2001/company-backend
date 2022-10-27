package com.nestgroup.companybackend.dao;

import com.nestgroup.companybackend.model.LogModel;
import org.springframework.data.repository.CrudRepository;

public interface LogDao extends CrudRepository<LogModel,Integer> {
}
