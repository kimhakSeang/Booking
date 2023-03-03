package com.booking.system.exception.file;

import org.springframework.http.HttpStatus;

import lombok.Data;
@Data
public class ResponseMessage {
    private HttpStatus STATUS;
    private String MSG;
	public ResponseMessage(HttpStatus sTATUS, String mSG) {
		super();
		STATUS = sTATUS;
		MSG = mSG;
	}
    
}
