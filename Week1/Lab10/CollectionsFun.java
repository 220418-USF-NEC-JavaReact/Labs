
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionsFun {

	// Fill out the class with the logic
	public List<String> nameList(List<Person> people){
		// Can not type 
		// List<String> resultStringList = new List<String>(); wrong
		List<String> resultStringList = new ArrayList<String>();
		for (Person p : people){
			resultStringList.add(p.getFirst());
		}
		return resultStringList;
	}

	public Map<String, Person> personMap(List<Person> people){
		Map<String, Person> resultMap = new HashMap<>();
		String tempKey = "";
		for(Person p: people){
			tempKey = p.getFirst() + p.getLast();
			resultMap.put(tempKey, p);

		}
		return resultMap;
	}

	public Person iteratorFun(List<Person> people){
		Iterator<Person> iteratorPerson = people.iterator();
		Person lastPerson = null;
		Person tempPerson = null;
		while (iteratorPerson.hasNext()){
			if (lastPerson == null){
				lastPerson = iteratorPerson.next();
			} 
			tempPerson = iteratorPerson.next();
			if (tempPerson.getAge() > lastPerson.getAge()){
				lastPerson = tempPerson;
			}

		}
		return lastPerson;
	}

}
