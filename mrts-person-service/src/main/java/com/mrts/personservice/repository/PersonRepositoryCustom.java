/**
 * 
 */
package com.mrts.personservice.repository;

import com.mrts.personservice.domain.Person;

/**
 * @author mahanraj
 *
 */
public interface PersonRepositoryCustom {
	
	Person getPerson(String id);

}
