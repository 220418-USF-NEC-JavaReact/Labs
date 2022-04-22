
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionsFun {

	// Fill out the class with the logic

	public List<String> nameList(List<Person> personList) {
		List<String> firstNameList = new ArrayList<>();

		for (Person person : personList) {
			firstNameList.add(person.getFirst());
		}

		return firstNameList;
	}

	public Map<String, Person> personMap(List<Person> personList) {
		Map<String, Person> fullNameMap = new HashMap<>();

		for (Person person : personList) {
			String key = person.getFirst() + "" + person.getLast();
			fullNameMap.put(key, person);
		}

		return fullNameMap;
	}

	public Person iteratorFun(List<Person> personList) {
		Iterator<Person> ageList = personList.iterator();
		int oldest = 0;
		Person oldestPerson = null;

		while(ageList.hasNext()) {
			Person tempPerson = ageList.next();
			if(tempPerson.getAge() > oldest) {
				oldestPerson = tempPerson;
				oldest = oldestPerson.getAge();
			}
		}

		return oldestPerson;
	}
}
