package com.booking.system.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;
import org.springframework.web.multipart.MultipartFile;

import com.booking.system.exception.NotFoundException;
import com.booking.system.exception.file.FileException;
import com.booking.system.model.Guest;
import com.booking.system.repository.GuestRepository;
import com.booking.system.service.GuestService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class GuestServiceImpl implements GuestService {
	@Autowired
	private GuestRepository guestRepository ;
	public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

    public static void checkFileType(MultipartFile file){System.out.println(">>>>>>>>>>>>>>>>>>>>>Wrong type <<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    	if(!TYPE.equals(file.getContentType())) {
    		
           throw new FileException(HttpStatus.EXPECTATION_FAILED, "Invalid type of file !");
    	}
    }
	
	@Override
	public Guest getGuestByID(Long id) {
		return guestRepository.findById(id).orElseThrow(() -> new NotFoundException());
	}

	@Override
	public List<Guest> getAll() {
		return guestRepository.findAll();
	}

	@Override
	public Guest addGuest(Guest guest) {
		return guestRepository.save(guest);
	}

	@Override
	public Map<Integer, Guest> uploadGuestExcel(MultipartFile file){
		checkFileType(file);
		Map<Integer,Guest> mapGuest= new HashMap<>();
		try {
			Workbook workbook = new XSSFWorkbook(file.getInputStream());
			Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rows = sheet.iterator();
			while(rows.hasNext()) {
				Row row = rows.next();
				
				Integer rowNumber = (int)row.getCell(0).getNumericCellValue();
				Long id = (long) row.getCell(1).getNumericCellValue();
				String name = row.getCell(2).getStringCellValue();
				Integer age = (int)row.getCell(3).getNumericCellValue();
				String gender = row.getCell(4).getStringCellValue();
				String address = row.getCell(5).getStringCellValue();
				
				Guest guest = new Guest(id, name, age, gender, address);
				mapGuest.put(rowNumber, guest);
			}
			//Record time running
			StopWatch timeSave = new StopWatch();
			timeSave.start();
			
			mapGuest.entrySet()          // to Set
					.stream()            // to Stream
					.map(s->s.getValue())// to Guest
					.forEach(s->guestRepository.save(s)); // save
			
			timeSave.stop();
			log.info("TIME SAVE : {} ", timeSave.getTotalTimeSeconds() );
			
			
		} catch (IOException e) {
			new FileException(HttpStatus.EXPECTATION_FAILED, "Invalid type of file !");
		}
		return mapGuest;
	}
	
}

