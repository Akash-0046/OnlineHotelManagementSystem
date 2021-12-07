package com.Department.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.Department.Model.Department;

@Repository
public interface DepartmentRepo extends MongoRepository<Department, Long>{

}
