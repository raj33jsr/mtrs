/**
 * 
 */
package com.mrts.personservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrts.personservice.domain.Person;
import com.mrts.personservice.domain.PersonResp;
import com.mrts.personservice.service.PersonService;

/**
 * @author mahanraj
 *
 */
@RestController
@RequestMapping("persons")
public class PersonRest {

	@Autowired
	PersonService personService;

	@GetMapping
	public PersonResp getPersons() {
		PersonResp personResp;
		personResp = personService.getPersons();

		return personResp;
	}

	@GetMapping("/{id}")
	public Person getPersonById(@PathVariable String id) {
		Person person;
		person = personService.getPersonById(id);

		return person;

	}

	@PostMapping
	public Person createPerson(@RequestBody Person person) {
		Person createdPerson;

		createdPerson = personService.createPerson(person);

		return createdPerson;

	}

	@PutMapping
	public Person updatePerson(@RequestBody Person person) {
		Person updatedPerson;

		updatedPerson = personService.updatePerson(person);
		return updatedPerson;
	}

	@DeleteMapping("/{id}")
	public void deletePerson(@PathVariable String id) {

		personService.deletePerson(id);

	}

	@GetMapping("/{age}/{gender}")
	public PersonResp getPersonByAgeGender(@PathVariable Integer age, @PathVariable String gender) {
		PersonResp personResp;
		personResp = personService.getPersonByAgeGender(age, gender);
		return personResp;
	}

}
