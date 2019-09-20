package com.mrts.ticketservice.exception;

import org.springframework.http.HttpStatus;

/**
 * The Class TicketServiceException.
 */
public class TicketServiceException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The status text. */
    private String statusText;

    /** The http status code. */
    private HttpStatus httpStatusCode;

    private Throwable throwable;

    public TicketServiceException(HttpStatus clientHttpStatusCode, String statusText, Throwable throwable) {
        super();
        this.httpStatusCode = clientHttpStatusCode;
        this.statusText = statusText;
        this.setThrowable(throwable);
    }

    /**
     * Gets the http status code.
     *
     * @return the http status code
     */
    public HttpStatus getHttpStatusCode() {
        return httpStatusCode;
    }

    /**
     * Sets the http status code.
     *
     * @param httpStatusCode
     *            the new http status code
     */
    public void setHttpStatusCode(HttpStatus httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    /**
     * Gets the status text.
     *
     * @return the status text
     */
    public String getStatusText() {
        return statusText;
    }

    /**
     * Sets the status text.
     *
     * @param statusText
     *            the new status text
     */
    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
