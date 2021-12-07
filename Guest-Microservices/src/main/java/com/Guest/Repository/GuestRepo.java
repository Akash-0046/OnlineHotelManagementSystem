package com.Guest.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Guest.Model.Guest;

@Repository
public interface GuestRepo extends MongoRepository<Guest, Integer>{

}
