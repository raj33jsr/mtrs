/**
 * 
 */
package com.mrts.ticketservice.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author bharamil
 *
 */
public class TicketResponse implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private List<Ticket> tickets;

    /**
     * @return the tickets
     */
    public List<Ticket> getTickets() {
        return tickets;
    }

    /**
     * @param tickets
     *            the tickets to set
     */
    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

}
