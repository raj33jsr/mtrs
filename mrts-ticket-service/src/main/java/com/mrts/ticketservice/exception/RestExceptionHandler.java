package com.mrts.ticketservice.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mrts.ticketservice.domain.ErrorResponse;

/**
 * The Class RestExceptionHandler.
 * 
 * @author bharamil
 */
@Component
public class RestExceptionHandler {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(RestExceptionHandler.class);

    /**
     * Handle error.
     *
     * @param ex
     *            the ex
     * @throws Exception
     *             the exception
     */
    public void handleError(Exception ex) throws Exception {
        LOGGER.debug("Inside handleError :: Received status: {} ", ex.getMessage());
        String responseBody = null;
        try {
            if (ex instanceof HttpClientErrorException) {
                HttpClientErrorException clientErrorException = (HttpClientErrorException) ex;
                responseBody = clientErrorException.getResponseBodyAsString();
                if (responseBody != null) {
                    LOGGER.debug("Inside handleError :: Received responseBody: {} ", responseBody);

                    ObjectMapper mapper = new ObjectMapper();
                    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    ErrorResponse responseError = mapper.readValue(responseBody, ErrorResponse.class);

                    throw new TicketServiceException(clientErrorException.getStatusCode(), responseError.getMessage(),
                            clientErrorException.getCause());
                } else {
                    throw new TicketServiceException(clientErrorException.getStatusCode(),
                            clientErrorException.getStatusText(), clientErrorException.getCause());
                }

            } else if (ex instanceof HttpServerErrorException) {
                HttpServerErrorException httpServerErrorException = (HttpServerErrorException) ex;
                responseBody = httpServerErrorException.getResponseBodyAsString();
                if (responseBody != null) {
                    LOGGER.debug("Inside handleError :: Received responseBody: {} ", responseBody);

                    ObjectMapper mapper = new ObjectMapper();
                    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    ErrorResponse responseError = mapper.readValue(responseBody, ErrorResponse.class);

                    throw new TicketServiceException(httpServerErrorException.getStatusCode(),
                            responseError.getMessage(), httpServerErrorException.getCause());
                }
            } else {
                responseBody = "Error while handling client error message!";
                throw new TicketServiceException(HttpStatus.INTERNAL_SERVER_ERROR, "unknown Error", ex.getCause());
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
