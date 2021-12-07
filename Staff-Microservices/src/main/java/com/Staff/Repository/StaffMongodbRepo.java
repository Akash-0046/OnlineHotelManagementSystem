package com.Staff.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Staff.Model.Staff;

public interface StaffMongodbRepo extends MongoRepository<Staff, Long>{

}
