/**
 * 
 */
package com.mrts.personservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrts.personservice.domain.Person;
import com.mrts.personservice.domain.PersonResp;
import com.mrts.personservice.repository.PersonRepository;

/**
 * @author mahanraj
 *
 */
@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;
	
	public PersonResp getPersons() {
		PersonResp personResp = new PersonResp();
		List<Person> persons;
		persons = personRepository.findAll();
		personResp.setPersons(persons);
		return personResp;
		
	}
	
	public Person getPersonById(String id) {
		
		Person person = null;
		person = personRepository.findById(id).get();
		return person;
		
	}
	
	public PersonResp getPersonByAgeGender(Integer age,String gender) {
		PersonResp personResp = new PersonResp();
		List<Person> persons;
		persons = personRepository.findAll();
		persons = persons.stream().
		filter(person->person.getAge()<=age).
		filter(person->gender.equalsIgnoreCase(person.getGender()))
		.collect(Collectors.toList());
		personResp.setPersons(persons);
		return personResp;
	}
	
	public Person createPerson(Person person) {
		Person createdPerson;
		createdPerson = personRepository.insert(person);
		
		return createdPerson;
	}
	
	public Person updatePerson( Person person) {
		
		Person updatedPerson;
		updatedPerson =  personRepository.save(person);
		
		return updatedPerson;
		
	}
	
	public void deletePerson(String id) {
		
		personRepository.deleteById(id);
	}
	
}
