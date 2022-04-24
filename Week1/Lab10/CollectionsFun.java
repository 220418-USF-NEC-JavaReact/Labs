
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionsFun {

	// Fill out the class with the logic
	public List<String> nameList(List<Person> person){
		List<String> names = new ArrayList<String>();

		for(int i=0;i<person.size();i++){
			names.add(person.get(i).getFirst());
		}
		return names;
	}

	public Map<String, Person> personMap(List<Person> person){
		Map<String, Person> map= new HashMap<String,Person>();
		
		for(int i=0;i<person.size();i++){
			map.put(person.get(i).getFirst()+person.get(i).getLast(), person.get(i));
		}
		return map;
	}

	public Person iteratorFun(List<Person> person){

		Iterator<Person> iter = person.iterator();
		int oldAge = 0;
		int age = 0;
		Person oldest = null;
		for(int i=0;iter.hasNext();i++){
			age = person.get(i).getAge();
			if(oldAge<age){
				oldAge = age;
				oldest = iter.next();
			} else {
				iter.next();
			}
		}
		return oldest;
	}
}
