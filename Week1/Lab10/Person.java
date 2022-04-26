public class Person {
    private String first;
    private String last;
    private int age;

    public Person(String first, String last, int age) {
        this.first = first;
        this.last = last;
        this.age = age;
    }

    public Person(){}

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // @Override
    // public String toString() {
    //     return this.getFirst() + " " + this.getLast() + " " + this.getAge();
    // }

    //overriding the toString() method
	@Override
	public String toString()
	{
		return this.first + " " + this.last + " " + this.age;
	}
}
