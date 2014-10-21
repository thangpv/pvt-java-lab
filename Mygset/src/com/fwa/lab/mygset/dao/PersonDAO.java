package com.fwa.lab.mygset.dao;

import java.util.List;

import com.fwa.lab.mygset.model.Person;

public interface PersonDAO {

	public void addPerson(Person p);

	public void updatePerson(Person p);

	public List<Person> listPersons();

	public Person getPersonById(int id);

	public void removePerson(int id);
}
