/**
 * 
 */
package com.mrts.fareservice.repository;

import java.util.List;

import com.mrts.fareservice.domain.Fare;

/**
 * @author mahanraj
 *
 */
public interface MrtsFareRepositoryCustom {
	
	Fare createFare(Fare fare);
	
	List<Fare> getFares();
	
	Fare getFareByTicketId(String ticketId);
	
	Fare updateFare(Fare fare);

}
