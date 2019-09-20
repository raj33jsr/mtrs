/**
 * 
 */
package com.mrts.ticketservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import com.mrts.ticketservice.domain.GetTicketCriteria;
import com.mrts.ticketservice.domain.Ticket;
import com.mrts.ticketservice.domain.TicketResponse;
import com.mrts.ticketservice.repository.TicketRepository;

/**
 * @author bharamil
 *
 */
@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    private static final Logger LOGGER = LoggerFactory.getLogger(TicketService.class);

    public TicketResponse getTickets(GetTicketCriteria getTicketCriteria) {
        TicketResponse ticketResponse = null;
        try {
            ticketResponse = new TicketResponse();
            List<Ticket> allTickets = ticketRepository.findAll();
            List<Ticket> filteredTikets = new ArrayList<Ticket>();
            if (allTickets != null) {
                if (getTicketCriteria.getAge() != 0) {
                    filteredTikets = allTickets.parallelStream()
                            .filter(ticket -> getTicketCriteria.getAge() > ticket.getMinAge())
                            .filter(ticket -> getTicketCriteria.getAge() < ticket.getMaxAge())
                            .collect(Collectors.toList());
                }
                if (getTicketCriteria.getValidityDays() != 0) {
                    filteredTikets = filteredTikets.parallelStream()
                            .filter(ticket -> getTicketCriteria.getValidityDays() == ticket.getValidityInDays())
                            .collect(Collectors.toList());
                }
                ticketResponse.setTickets(filteredTikets);
            }
        } catch (Exception e) {
            LOGGER.error("Exception in getTickes:: ", e);
        }
        return ticketResponse;
    }

    public TicketResponse getAllTickets() {
        TicketResponse ticketResponse = null;
        try {
            ticketResponse = new TicketResponse();
            List<Ticket> tickets = ticketRepository.findAll();
            ticketResponse.setTickets(tickets);
        } catch (Exception e) {
            LOGGER.error("Exception in getAllTickets:: ", e);
        }
        return ticketResponse;
    }

    public Ticket addTicket(Ticket ticket) {
        try {
            ticket = ticketRepository.insert(ticket);
        } catch (Exception e) {
            LOGGER.error("Exception in addTicket:: ", e);
        }
        return ticket;
    }

    public Ticket updateTicket(Ticket ticket) {
        try {
            ticket = ticketRepository.save(ticket);
        } catch (Exception e) {
            LOGGER.error("Exception in updateTicket:: ", e);
        }
        return ticket;
    }

    public Ticket getTicketById(String ticketId) {
        Ticket ticket = null;
        try {
            ticket = ticketRepository.findById(ticketId).get();
        } catch (Exception e) {
            LOGGER.error("Exception in getTicketById:: ", e);
        }
        return ticket;
    }

    public void deleteTicketById(String ticketId) {
        try {
            ticketRepository.deleteById(ticketId);
        } catch (Exception e) {
            LOGGER.error("Exception in deleteTicketById:: ", e);
        }
    }

    public Ticket getTicketByName(String name) {
        Ticket ticket = null;
        try {
            ticket = ticketRepository.getTicketByName(name);
        } catch (Exception e) {
            LOGGER.error("Exception in getTicketByName:: ", e);
        }
        return ticket;
    }

}
