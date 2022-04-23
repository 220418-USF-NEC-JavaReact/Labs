
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionsFun {

	// Fill out the class with the logic
	public List<String> nameList(List<Person> person) {
		
		List<String> newList = new ArrayList<>();
		for (Person p: person) {
			newList.add(p.getFirst());
		}

		return newList;
	}

	public Map<String, Person> personMap(List <Person> people) {

		Map<String, Person> m = new HashMap<>();
		for (Person p: people) {
			m.put(p.getFirst() + p.getLast(), p);
		}

		return m;
	}

	public Person iteratorFun(List<Person> people) {

		Iterator<Person> iT = people.iterator();
		Person oldest = iT.next();
			while(iT.hasNext()){
				if(iT.next().getAge() > oldest.getAge()){
				oldest = iT.next();
			}
		}
		return oldest;
	}

}
