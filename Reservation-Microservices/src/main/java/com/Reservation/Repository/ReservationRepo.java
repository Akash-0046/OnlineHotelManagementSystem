package com.Reservation.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Reservation.Model.Reservation;

public interface ReservationRepo extends MongoRepository<Reservation, Long>{

}
