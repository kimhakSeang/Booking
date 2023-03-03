package com.booking.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.system.model.Guest;
@Repository
public interface GuestRepository extends JpaRepository<Guest, Long>{
	

}
