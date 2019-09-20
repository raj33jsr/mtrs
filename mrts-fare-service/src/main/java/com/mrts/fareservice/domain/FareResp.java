/**
 * 
 */
package com.mrts.fareservice.domain;

import java.util.List;

/**
 * @author mahanraj
 *
 */
public class FareResp {
	
	List<Fare> fares;
	
	Integer totalPrice;

	/**
	 * @return the fares
	 */
	public List<Fare> getFares() {
		return fares;
	}

	/**
	 * @param fares the fares to set
	 */
	public void setFares(List<Fare> fares) {
		this.fares = fares;
	}

	/**
	 * @return the totalPrice
	 */
	public Integer getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
	
	

}
