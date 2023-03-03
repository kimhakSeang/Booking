package com.booking.system.exception;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//@ControllerAdvice
public class GeneralException  extends ResponseEntityExceptionHandler {
//	//Not Founds
//	@ExceptionHandler(NotFoundException.class)
//	public ResponseEntity<?> generalNoteFound(NotFoundException notFoundException) {
//		PropertyException pex = new PropertyException("Guest Not Found!", HttpStatus.NOT_FOUND, LocalDateTime.now(), notFoundException.getMessage());
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).body( pex);
//	}
//	@ExceptionHandler(BadRequestException.class)
//	public ResponseEntity<?> generalBadRequest(BadRequestException badRequestException) {
//		PropertyException pex = new PropertyException("Guest Not Found!", HttpStatus.BAD_REQUEST, LocalDateTime.now(), badRequestException.getMessage());
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(pex);
//	}
//	
//	//BAD Request
//	@Override
//    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
//		PropertyException pex = new PropertyException("Guest Not Found!", HttpStatus.BAD_REQUEST, LocalDateTime.now(),ex.getLocalizedMessage());
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//				.body(pex);
//    }
//	
//	// Internal Error
//	protected ResponseEntity<Object> handleExceptionInternal(ConversionNotSupportedException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
//			PropertyException pex = new PropertyException("Internal Server Error!", HttpStatus.INTERNAL_SERVER_ERROR, LocalDateTime.now(), ex.getLocalizedMessage());
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(pex);
//	}
//	
//	// Constraint Validation
//	 @ExceptionHandler(ConstraintViolationException.class)
//	 public ResponseEntity<?> validationException(ConstraintViolationException ex) {
//			PropertyException pex = new PropertyException("Error Validation !", HttpStatus.INTERNAL_SERVER_ERROR, LocalDateTime.now(), ex.getMessage());
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body( pex);
//	}

}
