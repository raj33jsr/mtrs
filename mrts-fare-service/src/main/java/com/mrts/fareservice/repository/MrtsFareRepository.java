/**
 * 
 */
package com.mrts.fareservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mrts.fareservice.domain.Fare;

/**
 * @author mahanraj
 *
 */
public interface MrtsFareRepository  extends MongoRepository<Fare,String>,MrtsFareRepositoryCustom{
	
	

}
