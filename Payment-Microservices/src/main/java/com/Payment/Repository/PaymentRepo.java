package com.Payment.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.Payment.Model.Payment;

@Repository
public interface PaymentRepo extends MongoRepository<Payment, Integer>{

}
