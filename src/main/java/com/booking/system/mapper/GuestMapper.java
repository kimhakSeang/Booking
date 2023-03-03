package com.booking.system.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.booking.system.DTO.GuestDTO;
import com.booking.system.model.Guest;

@Mapper
public interface GuestMapper {
	  GuestMapper Instance = Mappers.getMapper(GuestMapper.class);
      Guest toGuest(GuestDTO guestDTO);
      GuestDTO toGuestDTO(Guest guest);
}
