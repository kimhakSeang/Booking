package com.booking.system.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PropertyException {
	private String msg;
    private HttpStatus httpStatus;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    private String debugMessage;
	public PropertyException(String msg, HttpStatus httpStatus, LocalDateTime timestamp, String debugMessage) {
		super();
		this.msg = msg;
		this.httpStatus = httpStatus;
		this.timestamp = timestamp;
		this.debugMessage = debugMessage;
	}
    

}
