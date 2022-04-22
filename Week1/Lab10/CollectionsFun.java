
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionsFun {

	// Fill out the class with the logic

	/*creates a list of first names
	input: List<Person>
	output: List<String> */
	public List<String> nameList (List<Person> in) {
		List<String> firstNames = new ArrayList();

		for(Person name : in) {
			firstNames.add(name.getFirst());
		}

		return firstNames;
	}

	/*Loops through a list of Persons and assign a key
	input: List<Person>
	output: Map<String, Person> */
	public Map<String, Person> personMap (List<Person> in) {
		Map<String, Person> catMap = new HashMap();

		for(Person cat : in) {
			catMap.put(cat.getFirst().concat(cat.getLast()), cat);
		}
		return catMap;
	}

	/* Looks through a list of people and returns the oldest person from the list
	input: List<Person>
	output: Person */

	public Person iteratorFun (List<Person> in) {
		Iterator<Person> itr = in.iterator();
		Person buffer;
		Person oldiLocks = new Person(null, null, 0); //there was no constructor class in person.....

		//check if List<Person> exists
		if (itr.hasNext()) {
			buffer = itr.next();
			oldiLocks = buffer;
		}

		while (itr.hasNext()) {
			//retrieve the age of the next person in a buffer
			buffer = itr.next();

			//check ages of previous and current persons
			if (buffer.getAge() > oldiLocks.getAge()) {
				oldiLocks = buffer; //OldiLocks becomes the next person
			}

		}

		return oldiLocks;
	}
	

}
