import java.util.*;

public class Driver {
    public static void main(String args[]){

        // private String first;
        // private String last;
        // private int age;

        // public Person(String first, String last, int age)

        // public List<String> nameList(List<Person> persons)
        // public Map<String, Person> personMap(List<Person> persons) 
        // public Person iteratorFun(List<Person> persons)

        Person p1 = new Person("Dawit", "Alemu", 25);
        Person p2 = new Person("John", "Adam", 24);

        List<Person> persons = new ArrayList<Person>();

        persons.add(p1);
        persons.add(p2);

        CollectionsFun lst = new CollectionsFun();
        List<String> fNameList = lst.nameList(persons);
        Map <String, Person> lisOfPersons = lst.personMap(persons);
        Person olderPerson = lst.iteratorFun(persons);

        System.out.println("First Names:");
        for(String name: fNameList){
            System.out.println(name);
        }

        System.out.println("\n");
        System.out.println(lisOfPersons);

        System.out.println("\n");
        System.out.println("Older person: " + olderPerson.toString());
    }
}
