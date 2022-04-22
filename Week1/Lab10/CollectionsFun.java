
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionsFun {

	// Fill out the class with the logic

	// public nameList() which returns a List of Strings
    // take in a List of Person objects from above
    public List<String> nameList(List<Person> persons) {
        // loop through the list of Person objects and add their First names to a new
        // list
        List<String> listOfNames = new ArrayList<String>();
        for (Person pers : persons) {
            listOfNames.add(pers.getFirst());
        }
        return listOfNames;
    }

    // public personMap() which returns a Map with a String key and Person value
    // take in a List of Person Objects as a parameter
    public Map<String, Person> personMap(List<Person> persons) {
        // loop through the List of people, place them into the Map, with the key
        // (firstName + lastName)
        Map<String, Person> listOfPersons = new HashMap<>();

        // adding key-value pairs to a HashMap
        for (Person pers : persons) {
            listOfPersons.put(pers.getFirst() + pers.getLast(), pers);
        }
        return listOfPersons;
    }

    // public iteratorFun() which returns a Person
    // take in a List of Person objects and create an iterator from it
    // loop through the list with the iterator, and keep track of the oldest person
    // return oldest Person
    public Person iteratorFun(List<Person> persons) {
        Iterator<Person> itr = persons.iterator();

        int maxim = Integer.MIN_VALUE;
        Person pers = new Person();
        while (itr.hasNext()) {
            if (itr.next().getAge() > maxim) {
                maxim = itr.next().getAge();
                pers = itr.next();
            } 
        }
        return pers;
    }

}
