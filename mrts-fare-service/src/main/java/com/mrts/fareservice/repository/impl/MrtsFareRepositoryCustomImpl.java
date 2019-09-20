/**
 * 
 */
package com.mrts.fareservice.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mrts.fareservice.domain.Fare;
import com.mrts.fareservice.repository.MrtsFareRepositoryCustom;

/**
 * @author mahanraj
 *
 */
@Repository
public class MrtsFareRepositoryCustomImpl implements MrtsFareRepositoryCustom {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Fare createFare(Fare fare) {
		Fare createdFare = null;
		try {
			createdFare = mongoTemplate.save(fare);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return createdFare;
	}

	public Fare getFareByTicketId(String ticketId) {
		Fare fare = null;

		try {
			Query query = new Query();
			query.addCriteria(Criteria.where("ticketId").is(ticketId));
			fare = mongoTemplate.find(query, Fare.class).get(0);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return fare;

	}

	@Override
	public List<Fare> getFares() {
		List<Fare> farelst = null;
		try {
			farelst = mongoTemplate.findAll(Fare.class);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return farelst;
	}

	@Override
	public Fare updateFare(Fare fare) {
		//mongoTemplate.fi(Fare.class);
		return null;
	}

}
