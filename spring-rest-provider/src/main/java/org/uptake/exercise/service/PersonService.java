package org.uptake.exercise.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.uptake.exercise.domain.Person;
import org.uptake.exercise.domain.PersonList;

@Service("personService")
public class PersonService {

	protected static Logger logger = Logger.getLogger("service");

	// In-memory list
	private List<Person> persons = new ArrayList<Person>();
	// private List<Person> family = new ArrayList<Person>();
	private List<PersonList> familyList = new ArrayList<PersonList>();

	public PersonService() {
		logger.debug("Init database");

		// Create in-memory list
		Person person1 = new Person();
		person1.setId(0L);
		person1.setFirstName("John");
		person1.setLastName("Smith");
		person1.setMoney(1000.0);
		person1.setFamilyId(1);

		Person person2 = new Person();
		person2.setId(1L);
		person2.setFirstName("Jane");
		person2.setLastName("Adams");
		person2.setMoney(2000.0);
		person2.setFamilyId(1);

		Person person3 = new Person();
		person3.setId(2L);
		person3.setFirstName("Jeff");
		person3.setLastName("Mayer");
		person3.setMoney(3000.0);
		person3.setFamilyId(2);

		Person person4 = new Person();
		person4.setId(3L);
		person4.setFirstName("Harry");
		person4.setLastName("Mayer");
		person4.setMoney(3000.0);
		person4.setFamilyId(2);

		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
	}

	/**
	 * Retrieves all persons
	 */
	public List<Person> getAll() {
		logger.debug("Retrieving all persons");

		return persons;
	}

	/** retrieves family */
	public HashMap<Integer, List<Person>> showFamily() {
		logger.debug("Retrieving family lookup");
		//List<Person> family = new ArrayList<Person>();
		HashMap<Integer, List<Person>> map = new HashMap<Integer, List<Person>>();
		Integer key = null;
		for (int i = 0; i < persons.size(); i++) {
			key = persons.get(i).getFamilyId();//0,1,2,3

			if (map.get(key) == null) {
				map.put(key, new ArrayList<Person>());
			}
			map.get(key).add(persons.get(i));
			System.out.println("Family key: " + key + "Person name added: " +persons.get(i).getFirstName()+"FamilyID from person added is : "+persons.get(i).getFamilyId());

		}

		return map;

	}

	/**
	 * Retrieves a single person
	 */
	public Person get(Long id) {
		logger.debug("Retrieving person with id: " + id);

		for (Person person : persons) {
			if (person.getId().longValue() == id.longValue()) {
				logger.debug("Found record");
				return person;
			}
		}

		logger.debug("No records found");
		return null;
	}

	/**
	 * Adds a new person
	 */
	public Person add(Person person) {
		logger.debug("Adding new person");

		try {
			// Find suitable id
			Long newId = 0L;
			Boolean hasFoundSuitableId = false;
			while (hasFoundSuitableId == false) {
				for (int i = 0; i < persons.size(); i++) {
					if (persons.get(i).getId().longValue() == newId.longValue()) {
						newId++;
						break;
					}

					// Exit while loop
					if (i == persons.size() - 1) {
						logger.debug("Assigning id: " + newId);
						hasFoundSuitableId = true;
					}
				}
			}

			// Assign new id
			person.setId(newId);
			// Add to list
			persons.add(person);

			logger.debug("Added new person");
			return person;
		} catch (Exception e) {
			logger.error(e);
			return null;
		}
	}

	/**
	 * Deletes an existing person
	 */
	public Boolean delete(Long id) {
		logger.debug("Deleting person with id: " + id);

		try {
			for (Person person : persons) {
				if (person.getId().longValue() == id.longValue()) {
					logger.debug("Found record");
					persons.remove(person);
					return true;
				}
			}

			logger.debug("No records found");
			return false;

		} catch (Exception e) {
			logger.error(e);
			return false;
		}
	}

	/**
	 * Edits an existing person
	 */
	public Boolean edit(Person person) {
		logger.debug("Editing person with id: " + person.getId());

		try {
			for (Person p : persons) {
				if (p.getId().longValue() == person.getId().longValue()) {
					logger.debug("Found record");
					persons.remove(p);
					persons.add(person);
					return true;
				}
			}

			logger.debug("No records found");
			return false;

		} catch (Exception e) {
			logger.error(e);
			return false;
		}
	}
}
