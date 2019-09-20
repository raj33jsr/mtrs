/**
 * 
 */
package com.mrts.personservice.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.mrts.personservice.domain.Person;
import com.mrts.personservice.repository.PersonRepositoryCustom;

/**
 * @author mahanraj
 *
 */
@Repository
public class PersonRepositoryImpl implements PersonRepositoryCustom{
	
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public Person getPerson(String id) {
		
		return null;
	}

}
