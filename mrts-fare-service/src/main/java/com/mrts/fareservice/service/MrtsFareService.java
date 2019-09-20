/**
 * 
 */
package com.mrts.fareservice.service;

import com.mrts.fareservice.domain.Fare;
import com.mrts.fareservice.domain.FareResp;

/**
 * @author mahanraj
 *
 */

public interface MrtsFareService {
	
	Fare createFare(Fare fare);
	
	FareResp getFares();
	
	Fare getFareByTicketId(String ticketId);
	
	Fare updateFare(Fare fare);
	
	void deleteFare(String id);
	
	FareResp getFareTotal();

}
