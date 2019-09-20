/**
 * 
 */
package com.mrts.ticketservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mrts.ticketservice.domain.Ticket;

/**
 * @author bharamil
 *
 */
public interface TicketRepository extends MongoRepository<Ticket, String>, TicketCustomRepository {

}
