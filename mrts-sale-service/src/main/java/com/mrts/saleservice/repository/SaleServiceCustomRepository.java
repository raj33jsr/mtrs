/**
 * 
 */
package com.mrts.saleservice.repository;

import com.mrts.saleservice.domain.SoldTickets;

/**
 * @author bharamil
 *
 */
public interface SaleServiceCustomRepository {

    public SoldTickets getSoldTicketForPerson(String personId);

}
