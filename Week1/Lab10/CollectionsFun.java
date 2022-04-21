
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionsFun {

	// Fill out the class with the logic
	public List<String> nameList(List<Person> pop){
		List<String> first = new ArrayList<>();
		for(Person p : pop){
			first.add(p.getFirst());
		}
		return first;
	}
	public Map<String, Person> personMap(List<Person> a){
		Map<String, Person> plot = new HashMap<>();
		for(Person b : a){
			plot.put(b.getFirst().concat(b.getLast()), b);
		}
		return plot;
	}
	public Person iteratorFun(List<Person> pop){
		Iterator<Person> census = pop.iterator();
		Person oldest = census.next();
			while(census.hasNext()){
				if(census.next().getAge() > oldest.getAge()){
				oldest = census.next();
			}
		}
		return oldest;
	}
}
