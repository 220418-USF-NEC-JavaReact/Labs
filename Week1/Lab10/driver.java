import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class driver {
    public static void main(String[] args) {
        CollectionsFun global = new CollectionsFun();

        /*task 1*/
        List<Person> t1A = new ArrayList<Person>();

        for (int i = 0; i <= 3; i ++) {
            t1A.add(new Person("Robert" + i, "Duo", i*7));
        }

        List<String> r1 = global.nameList(t1A); 

        for(int i = 0; i < r1.size(); i++) {
            System.out.println("Names: " + r1.get(i));
        }
        /*task 1 complete*/

        /*task 2: catMap*/
        Map<String, Person> t2 = new HashMap<String, Person>();

        t2 = global.personMap(t1A);

        for(Map.Entry<String, Person> t2A : t2.entrySet()) {
            System.out.println("Key: " + t2A.getKey() + " value (AGE): " + t2A.getValue().getAge());
        }

        //retrieve a value at a key
        System.out.println("Age of Person at Key(Robert0Duo): " + t2.get("Robert0Duo").getAge());

        /*task 2 complete*/

        /*task 3*/
        Person t3 = global.iteratorFun(t1A);

        System.out.println("Oldest: " + t3.getAge());
    }  
}
