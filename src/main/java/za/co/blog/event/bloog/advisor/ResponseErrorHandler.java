//package za.co.blog.event.bloog.advisor;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//import za.co.blog.event.bloog.exception.ResourceNotFoundException;
//
//@ControllerAdvice
//public class ResponseErrorHandler extends ResponseEntityExceptionHandler {
//
//	@ExceptionHandler(value = { ResourceNotFoundException.class })
//	protected ResponseEntity<Object> handleConflict(
//					RuntimeException ex, WebRequest request) {
//		String bodyOfResponse = "This should be application specific";
//		return handleExceptionInternal(ex, bodyOfResponse,
//						new HttpHeaders(), HttpStatus.CONFLICT, request);
//	}
//}
