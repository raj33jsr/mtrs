/**
 * 
 */
package com.mrts.personservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mrts.personservice.domain.Person;

/**
 * @author mahanraj
 *
 */
public interface PersonRepository extends MongoRepository<Person, String>,PersonRepositoryCustom{

}
