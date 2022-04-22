
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionsFun {

	// Fill out the class with the logic
    public List<String> nameList(List<Person> pList){

        List<String> firsts = new ArrayList<String>();
        for(Person temp:pList){
            firsts.add(temp.getFirst());
        }
        return firsts;
    }

    public Map<String, Person> personMap(List<Person> pList){

        Map<String, Person> pm = new HashMap<>();
        for(Person temp:pList){
            pm.put(temp.getFirst()+temp.getLast(),temp);
        }
        return pm;
    }

    public Person iteratorFun(List<Person> pList){

        Iterator<Person> pIterator = pList.iterator();
        Person old;
        old = pIterator.next();

        while(pIterator.hasNext()){
            Person temp = pIterator.next();
            if (temp.getAge() > old.getAge()){
                old = temp;
            }
        }
        return  old;
    }

}
