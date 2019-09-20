/**
 * 
 */
package com.mrts.ticketservice.repository.impl;

import org.springframework.stereotype.Repository;
import com.mrts.ticketservice.domain.Ticket;
import com.mrts.ticketservice.repository.TicketCustomRepository;

/**
 * @author bharamil
 *
 */
@Repository
public class TicketRepositoryImpl implements TicketCustomRepository {

    @Override
    public Ticket getTicketByName(String name) {
        System.out.println("in getTicketByName");
        return null;
    }

}
