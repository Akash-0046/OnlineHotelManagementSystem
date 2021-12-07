package com.Guest.Service;

import java.util.List;
import com.Guest.Model.Guest;
import com.google.common.base.Optional;

public interface GuestService {
	
	Guest addGuest(Guest guest);

	Guest updateGuest(Guest guest);

	String deleteGuest(int id);

	Optional<Guest> getGuest(int id);

	List<Guest> getAllGuest();


}
