
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionsFun {

	// Fill out the class with the logic
	public List<String> nameList(List<Person> people) {
		List<String> names = new ArrayList<String>();
		for(Person p : people) {
			names.add(p.getFirst());
		}
		return names;
	}

	public Map<String, Person> personMap(List<Person> people) {
		Map<String, Person> personMap = new HashMap<>();
		for(Person p : people) {
			personMap.put(p.getFirst() + " " + p.getLast(), p);
		}
		return personMap;
	}

	// Uncertain why this function is not entered, I will
	// fix at a later date.
	public Person iteratorFun(List<Person> people) {
		Iterator<Person> fun = people.iterator();
		Person oldest = people.get(0);
		while(fun.hasNext()) {
			Person curr = fun.next();
			if(curr.getAge() > oldest.getAge()) {
				oldest = curr;
			}
		}
		return oldest;
	}
}
