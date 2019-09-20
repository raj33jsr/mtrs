/**
 * 
 */
package com.mrts.ticketservice.repository;

import com.mrts.ticketservice.domain.Ticket;

/**
 * @author bharamil
 *
 */
public interface TicketCustomRepository {

    public Ticket getTicketByName(String name);
}
