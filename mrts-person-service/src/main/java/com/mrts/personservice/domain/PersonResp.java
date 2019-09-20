/**
 * 
 */
package com.mrts.personservice.domain;

import java.util.List;

/**
 * @author mahanraj
 *
 */
public class PersonResp {
	
	List<Person> persons;

	/**
	 * @return the persons
	 */
	public List<Person> getPersons() {
		return persons;
	}

	/**
	 * @param persons the persons to set
	 */
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	
	

}
