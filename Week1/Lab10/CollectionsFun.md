# In the `CollectionsFun.java` file, write code to do the following:

Imagine you are given the following Java object

java

```
public class Person{
    private String first;
    private String last;
    private int age;

    public Person(String first, String last, int age){
        this.first = first;
        this.last = last;
        this.age = age;
    }

    public getFirst(){
        return first;
    }

    public setFirst(String first){
        this.first = first;
    }

    public getLast(){
        return last;
    }

    public void setLast(String last){
        this.last = last;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
```

1. Create a public method called `nameList` which returns a List of Strings

-   The method should take in a List of Person objects from above
-   The method should loop through the list of Person objects and add their First names to a new list
-   Return the List of first names

2. Create a public method called `personMap` which returns a Map with a String key and Person value

-   The method should take in a List of Person Objects as a parameter
-   Loop through the List of people, and place them into the Map, with the key being their first and last name concatenated
-   Return the Map of Person and Objects

3. Create a public method called `iteratorFun` which returns a Person

-   The method should take in a List of Person objects
-   Create an iterator from the List of Person objects passed into the List
-   Loop through the list with the iterator, and keep track of the oldest person
-   Return the oldest Person

## Once you have completed the logic, compile the `CollectionsFun.java` file

## Compile the Lab10.java file

## Run the Lab10.class file to see if you have successfully completed the lab
