package com.Reservation.Service;

import java.util.List;
import com.Reservation.Model.Reservation;
import com.google.common.base.Optional;

public interface ReservationService {

	String addReservation(Reservation book);

	Reservation updateReservation(Reservation book);

	String deleteReservation(long parseLong);

	List<Reservation> getResList();

	Optional<Reservation> getReservation(long parseLong);

}
