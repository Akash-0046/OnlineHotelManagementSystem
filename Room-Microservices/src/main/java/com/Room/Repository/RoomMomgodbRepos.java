package com.Room.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.Room.Model.Room;

@Repository
public interface RoomMomgodbRepos extends MongoRepository<Room, Long> {

	@Query("{roomAvl:true}")
	List<Room> findAvailable();
}
