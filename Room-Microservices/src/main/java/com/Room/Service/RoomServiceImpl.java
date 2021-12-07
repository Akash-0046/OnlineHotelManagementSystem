package com.Room.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Room.Model.Room;
import com.Room.Model.RoomList;
import com.Room.Repository.RoomMomgodbRepos;
import com.google.common.base.Optional;

@Service
public class RoomServiceImpl implements RoomService{
	
	@Autowired
	RoomMomgodbRepos  roomMongodbRepo;

	@Override
	public Room addRoom(Room room) {
		// TODO Auto-generated method stub
		return roomMongodbRepo.insert(room);
	}

	@Override
	public Optional<Room> getRoom(long parseLong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room updateRoom(Room room) {
		// TODO Auto-generated method stub
		return roomMongodbRepo.save(room);
	}

	@Override
	public String deleteRoom(long parseLong) {
		roomMongodbRepo.deleteById(parseLong);
		return "Room Number "+parseLong+" Deleted";
	}

	@Override
	public List<Room> getAllRoom() {
		// TODO Auto-generated method stub
		return roomMongodbRepo.findAll();
	}



	@Override
	public RoomList getRoomAvl() {
		// TODO Auto-generated method stub
		RoomList list=new RoomList();
		list.setAllRoom(roomMongodbRepo.findAvailable());;
		return list;
	}

}
