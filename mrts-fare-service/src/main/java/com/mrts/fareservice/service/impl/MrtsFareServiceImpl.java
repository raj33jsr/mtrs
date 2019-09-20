/**
 * 
 */
package com.mrts.fareservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrts.fareservice.domain.Fare;
import com.mrts.fareservice.domain.FareResp;
import com.mrts.fareservice.repository.MrtsFareRepository;
import com.mrts.fareservice.service.MrtsFareService;

/**
 * @author mahanraj
 *
 */
@Service
public class MrtsFareServiceImpl implements MrtsFareService{
	
	@Autowired
	MrtsFareRepository mrtsFareRepository;
	
	
	@Override
	public Fare createFare(Fare fare) {
		return mrtsFareRepository.insert(fare);
	}
	
	public Fare getFareByTicketId(String ticketId) {
		Fare fare = null;
		fare = mrtsFareRepository.getFareByTicketId(ticketId);
		return fare;
	}

	@Override
	public FareResp getFares() {
		FareResp fareResp =  new FareResp();
		List<Fare> fareLst = null;
		fareLst = mrtsFareRepository.findAll();
		fareResp.setFares(fareLst);
		
		return fareResp;
	}

	@Override
	public Fare updateFare(Fare fare) {
		Fare fareVal = null;
		fareVal = mrtsFareRepository.getFareByTicketId(fare.getTicketId());
		
		if(fareVal != null) {
			fareVal = mrtsFareRepository.save(fare);
		}
		
		return fareVal;
	}

	@Override
	public void deleteFare(String id) {
		
		mrtsFareRepository.deleteById(id);
	}

	@Override
	public FareResp getFareTotal() {
		FareResp fareResp =  new FareResp();
		List<Fare> fareLst = null;
		Integer sum;
		fareLst = mrtsFareRepository.findAll();
		sum = fareLst.stream().
		map(fare->fare.getTicketPrice()).
		reduce(0, (a, b) -> a + b);
		fareResp.setTotalPrice(sum);
		return fareResp;
	}
	
	

}
