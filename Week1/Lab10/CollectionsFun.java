
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionsFun {

	// Fill out the class with the logic

    public List<String> nameList(List<Person> persons) {

        List<String> listOfFirstNames = new ArrayList<String>();

        for (Person person: persons) {
            listOfFirstNames.add(person.getFirst());
        }

        return listOfFirstNames;

    }

    public Map<String, Person> personMap(List<Person> persons) {

        Map<String, Person> personMap = new HashMap<String, Person>();
        String key = "";

        for (Person person : persons) {
            key = person.getFirst() + person.getLast();

            personMap.put(key, person);

        }
        return personMap;

    }

    public Person iteratorFun(List<Person> person) {
        Iterator<Person> iterator = person.iterator();

        Person olderPerson = null;
        Person comparePerson = null;

        while(iterator.hasNext()) {
            if (olderPerson == null){
                olderPerson = iterator.next();
            }
            comparePerson = iterator.next();
            if (comparePerson.getAge() > olderPerson.getAge()){
                olderPerson = comparePerson;
            }

        }
            return olderPerson;
    }

}
