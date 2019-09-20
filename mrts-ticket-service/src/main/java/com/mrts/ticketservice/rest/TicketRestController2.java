/**
 * 
 */
package com.mrts.ticketservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mrts.ticketservice.domain.GetTicketCriteria;
import com.mrts.ticketservice.domain.Ticket;
import com.mrts.ticketservice.domain.TicketResponse;
import com.mrts.ticketservice.service.TicketService;

/**
 * The Class TicketRestController.
 *
 * @author bharamil
 */
@RestController
@RequestMapping("ticket2")
public class TicketRestController2 {

    /** The ticket service. */
    @Autowired
    private TicketService ticketService;

    /**
     * Gets the tickets.
     *
     * @param getTicketCriteria
     *            the get ticket criteria
     * @return the tickets
     */
    @PostMapping("/filter")
    public TicketResponse getTickets(@RequestBody GetTicketCriteria getTicketCriteria) {
        return ticketService.getTickets(getTicketCriteria);
    }

    /**
     * Gets the ticket by id.
     *
     * @param ticketId
     *            the ticket id
     * @return the ticket by id
     */
    @GetMapping("/{ticketId}")
    public Ticket getTicketById(@PathVariable("ticketId") String ticketId) {
        return ticketService.getTicketById(ticketId);
    }

    /**
     * Gets the ticket by name.
     *
     * @param name
     *            the name
     * @return the ticket by name
     */
    @GetMapping("/name/{ticketName}")
    public Ticket getTicketByName(@PathVariable("ticketName") String name) {
        return ticketService.getTicketByName(name);
    }

    /**
     * Gets the tickets.
     *
     * @return the tickets
     */
    @GetMapping
    public TicketResponse getTickets() {
        return ticketService.getAllTickets();
    }

    /**
     * Adds the ticket.
     *
     * @param ticket
     *            the ticket
     * @return the ticket
     */
    @PostMapping
    public Ticket addTicket(@RequestBody Ticket ticket) {
        return ticketService.addTicket(ticket);
    }

    /**
     * Update ticket.
     *
     * @param ticket
     *            the ticket
     * @return the ticket
     */
    @PutMapping
    public Ticket updateTicket(@RequestBody Ticket ticket) {
        return ticketService.updateTicket(ticket);
    }

    /**
     * Delete ticket.
     *
     * @param ticketId
     *            the ticket id
     */
    @DeleteMapping("/{ticketId}")
    public void deleteTicket(@PathVariable("ticketId") String ticketId) {
        ticketService.deleteTicketById(ticketId);
    }

}
