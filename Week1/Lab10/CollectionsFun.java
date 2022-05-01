
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionsFun {

	// Fill out the class with the logic

	// return list of first names
	public List<String> nameList(List<Person> personList){
		List<String> firstNames = new ArrayList<>();
		for(Person p : personList){
			firstNames.add(p.getFirst());
		}
		return firstNames;
	}
	// return map with key firstLast and val person 
	public Map<String,Person> personMap(List<Person> personList){
		Map<String,Person> endMap = new HashMap<>();
		for(Person p: personList){
			endMap.put(p.getFirst().concat(p.getLast()),p);
		}
		return endMap;
	}
	// create person iterator, return oldest person
	public Person iteratorFun(List<Person> personList){
		Iterator<Person> pIterator = personList.iterator();
		int oldestAge = 0;
		int oldestIndex = 0;
		int iCounter = 0;
		while(pIterator.hasNext()){
			Person currentPerson = pIterator.next();
			if (currentPerson.getAge() > oldestAge){
				oldestAge = currentPerson.getAge();
				oldestIndex = iCounter;
			}
			iCounter++;
		}
		System.out.println("oldest age: " + personList.get(oldestIndex).getAge());
		return personList.get(oldestIndex);
	}

}
