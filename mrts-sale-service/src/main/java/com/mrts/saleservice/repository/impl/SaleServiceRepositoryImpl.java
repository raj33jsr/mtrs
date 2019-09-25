/**
 * 
 */
package com.mrts.saleservice.repository.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import com.mrts.saleservice.domain.Sale;
import com.mrts.saleservice.domain.SoldTickets;
import com.mrts.saleservice.repository.SaleServiceCustomRepository;

/**
 * @author bharamil
 *
 */
public class SaleServiceRepositoryImpl implements SaleServiceCustomRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public SoldTickets getSoldTicketForPerson(String personId) {
        SoldTickets soldTickets = null;
        try {
            Query query = new Query(Criteria.where("personId").is(personId));
            List<Sale> tickets = mongoTemplate.find(query, Sale.class);
            if (tickets != null) {
                soldTickets = new SoldTickets();
                soldTickets.setSoldTickets(tickets);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return soldTickets;
    }

}
