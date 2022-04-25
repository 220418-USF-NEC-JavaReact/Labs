import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class CollectionsFun {

 public static void main(String args[]){
	 	// Fill out the class with the logic
	public List<String> nameList(List<Person> person){

		List<String> personList = new ArrayList<String>();
		for (Person p : person){
			personList.add(p.getFirst());
		}
		return personList;
	}

	public Map<String, Person> personMap(List<Person> person){
		Map<String, Person> personMap = new HashMap<>();
		String temp = "";
		for(Person p: person){
			temp = p.getFirst() + p.getLast();
			personMap.put(temp, p);

		}
		return personMap;
	}
 }

}
