package com.booking.system.exception.file;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class FileException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	private HttpStatus status;
	private String msg;

}
