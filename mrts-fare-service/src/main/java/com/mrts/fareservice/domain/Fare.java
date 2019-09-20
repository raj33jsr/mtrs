/**
 * 
 */
package com.mrts.fareservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author mahanraj
 *
 */
@Document("mrts_fare")
public class Fare {
	
	@Id
    private String id;
	
	private String ticketId;
	
	
	private Integer ticketPrice;


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * @return the ticketId
	 */
	public String getTicketId() {
		return ticketId;
	}


	/**
	 * @param ticketId the ticketId to set
	 */
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}


	/**
	 * @return the ticketPrice
	 */
	public Integer getTicketPrice() {
		return ticketPrice;
	}


	/**
	 * @param ticketPrice the ticketPrice to set
	 */
	public void setTicketPrice(Integer ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	


}
