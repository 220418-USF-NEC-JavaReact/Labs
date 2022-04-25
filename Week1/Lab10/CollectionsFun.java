
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionsFun {

	// Fill out the class with the logic
	public List<String> nameList(List<Person> person){
		List<String> names = new ArrayList<String>();

		for(Person p: person){
			names.add(p.getFirst());
		}

		return names;
	}

	public Map<String, Person> personMap(List<Person> person){
		Map<String, Person> map= new HashMap<String,Person>();		

		for(Person p : person){
			map.put(p.getFirst()+p.getLast(), p);
		}
		return map;
	}

	public Person iteratorFun(List<Person> person){

		Iterator<Person> iter = person.iterator();
		int oldAge = 0;
		Person oldest = null;		

		for(Person p : person){
			if(oldAge<p.getAge()){
				oldAge = p.getAge();
				oldest = iter.next();
			} else {
				iter.next();
			}
		}

		return oldest;
	}
}
