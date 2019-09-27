/**
 * 
 */
package com.mrts.saleservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mrts.saleservice.domain.Sale;
import com.mrts.saleservice.domain.SoldTickets;
import com.mrts.saleservice.repository.SaleServiceRepository;

/**
 * @author bharamil
 *
 */
@Service
public class SalesService {

    @Autowired
    private SaleServiceRepository saleServiceRepository;

    public Sale saleTicket(Sale sale) {
        Sale soldTicket = null;
        try {
            soldTicket = saleServiceRepository.insert(sale);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return soldTicket;
    }

    public SoldTickets getSoldTicketForPerson(String personId) {
        SoldTickets soldTickets = null;
        try {
            soldTickets = saleServiceRepository.getSoldTicketForPerson(personId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return soldTickets;
    }

    public SoldTickets getAllSoldTickets() {
        SoldTickets soldTickets = null;
        try {
            List<Sale> tickets = saleServiceRepository.findAll();
            if (tickets != null) {
                soldTickets = new SoldTickets();
                soldTickets.setSoldTickets(tickets);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return soldTickets;
    }

    public Sale getSaleById(String saleId) {
        Sale soldTicket = null;
        try {
            soldTicket = saleServiceRepository.findById(saleId).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return soldTicket;
    }

    public Sale updateSale(Sale sale) {
        Sale updatedSale = null;
        try {
            updatedSale = saleServiceRepository.save(sale);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return updatedSale;
    }

    public String deleteSale(String saleId) {
        try {
            saleServiceRepository.deleteById(saleId);
        } catch (Exception e) {
            e.printStackTrace();
            return "FAILED";
        }
        return "SUCCESS";
    }

}
