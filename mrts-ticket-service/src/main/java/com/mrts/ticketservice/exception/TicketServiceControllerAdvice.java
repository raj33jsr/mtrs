package com.mrts.ticketservice.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.mrts.ticketservice.domain.ErrorResponse;

/**
 * The Class TicketServiceControllerAdvice.
 */
@ControllerAdvice
public class TicketServiceControllerAdvice {

    /** The error message headers. */
    private MultiValueMap<String, String> errorMessageHeaders = new HttpHeaders();

    /**
     * Gets the error message headers.
     *
     * @return the error message headers
     */
    private MultiValueMap<String, String> getErrorMessageHeaders() {
        return errorMessageHeaders;
    }

    /**
     * Instantiates a new sales id based controller advice.
     */
    public TicketServiceControllerAdvice() {
        super();
        errorMessageHeaders.add("Content-Type", MediaType.APPLICATION_JSON.toString());
    }

    /**
     * Handle bad request exception.
     *
     * @param salesIdBasedException
     *            the sales id based exception
     * @return the response entity
     */
    @ExceptionHandler(TicketServiceException.class)
    public ResponseEntity<ErrorResponse> handleBadRequestException(TicketServiceException salesIdBasedException) {
        ErrorResponse error = new ErrorResponse();
        error.setMessage(salesIdBasedException.getStatusText());
        return new ResponseEntity<ErrorResponse>(error, getErrorMessageHeaders(),
                salesIdBasedException.getHttpStatusCode());
    }

    /**
     * Handle exception.
     *
     * @param exception
     *            the exception
     * @return the response entity
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception exception) {
        ErrorResponse error = new ErrorResponse();
        error.setMessage(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        return new ResponseEntity<ErrorResponse>(error, getErrorMessageHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
