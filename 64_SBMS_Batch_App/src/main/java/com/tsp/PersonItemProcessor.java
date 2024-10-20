package com.tsp;

import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person>{
	@Override
	public Person process(Person item)
	{
		String firstName = item.getFname();
		String lastName = item.getLname();
		
		Person transformedPerson = new Person(firstName.toUpperCase(), lastName.toUpperCase());
		
		return transformedPerson;
	}

}
