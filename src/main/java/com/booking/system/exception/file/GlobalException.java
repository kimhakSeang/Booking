package com.booking.system.exception.file;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MultipartException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalException  {

	@ExceptionHandler(FileException.class)
	public ResponseEntity<?> handleMethodArgumentNotValid(FileException e) {
		ResponseMessage message = new ResponseMessage(HttpStatus.EXPECTATION_FAILED, "Wrong exstension!");
		return ResponseEntity.status(e.getStatus()).body(message);
	}
	@ExceptionHandler( MultipartException.class )
	public ResponseEntity<?> multipartExceptionHandler ( MultipartException e ) {
	  log.error( "error extension!" , e );
	  return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Extension file invalid!");
	}
//	@ExceptionHandler(MultipartException.class)
//	public String handleError1(MultipartException e, RedirectAttributes redirectAttributes) {
//		redirectAttributes.addFlashAttribute("message","Error");
//		return "redirect:/uploadStatus";
//	}
}
