package com.booking.system.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.booking.system.model.Guest;
import com.booking.system.service.GuestService;
import com.booking.system.service.impl.GuestServiceImpl;

@RestController
@RequestMapping("/guest")
public class GuestController {
	
	@Autowired
	private GuestService service;

	@GetMapping("/get/{id}")
	public Guest getByID(@PathVariable("id") Long id) {
		return service.getGuestByID(id);
	}
	
	@GetMapping(value = "/get/all")
	public List<Guest> getALL() {
		return service.getAll();
	}
	
	@PostMapping(value = "/add")
	public Guest add(@RequestBody Guest guest) {
		return service.addGuest(guest);
	}
	
	@PostMapping(value = "/upload/file")
	public ResponseEntity<?>  uploadFile(@RequestParam("file")MultipartFile file) throws Exception {
		Map<Integer, Guest> guestExcel = service.uploadGuestExcel(file);
		return ResponseEntity.ok(guestExcel);
	}
	
}
