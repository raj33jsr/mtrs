/**
 * 
 */
package com.mrts.fareservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrts.fareservice.domain.Fare;
import com.mrts.fareservice.domain.FareResp;
import com.mrts.fareservice.service.MrtsFareService;

/**
 * @author mahanraj
 *
 */
@RestController
@RequestMapping("fares")
@RefreshScope
public class MrtsFareRest {
	
	@Autowired
	MrtsFareService mrtsFareService;
	
	@Value("${demo.value.test}")
	String demoVal;
	
	@GetMapping
	public FareResp getFares() {
		FareResp fareResp;
		fareResp = mrtsFareService.getFares();
		return fareResp;
	}
	
	@GetMapping("/{ticketId}")
	public Fare getFareByTicketId(@PathVariable String ticketId) {
		
		Fare fare;
		fare = mrtsFareService.getFareByTicketId(ticketId);
		return fare;
	}
	
	@GetMapping("/val")
	public String getStaticvalue() {
		return demoVal; 
	}
	
	@PostMapping
	public Fare createFare(@RequestBody Fare fare) {
		Fare createdFare;
		createdFare = mrtsFareService.createFare(fare);
		return createdFare;
	}
	
	@PutMapping
	public Fare updateFare(@RequestBody Fare fare) {
		Fare updatedFare;
		updatedFare = mrtsFareService.updateFare(fare);
		return updatedFare;
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteFare(@PathVariable String id) {
		mrtsFareService.deleteFare(id);
		
	}
	
	@GetMapping("/sum")
	public FareResp getFareTotal() {
		FareResp fareResp;
		fareResp = mrtsFareService.getFareTotal();
		
		return fareResp;
	}

}
