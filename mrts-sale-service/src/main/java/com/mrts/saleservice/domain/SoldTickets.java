/**
 * 
 */
package com.mrts.saleservice.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author bharamil
 *
 */
public class SoldTickets implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private List<Sale> soldTickets;

    public List<Sale> getSoldTickets() {
        return soldTickets;
    }

    public void setSoldTickets(List<Sale> soldTickets) {
        this.soldTickets = soldTickets;
    }

}
