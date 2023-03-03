package com.booking.system.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.booking.system.model.Guest;

public interface GuestService {
      Guest getGuestByID(Long id);
      List<Guest> getAll();
      Guest addGuest(Guest guest);
      Map<Integer, Guest> uploadGuestExcel(MultipartFile file);
}
