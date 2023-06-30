package AssistedPractice;

public class ClassObjectConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Person person1 = new Person("ABC", 25);
	      Person person2 = new Person("DEF", 30);
	        
	        System.out.println("Person 1:");
	        person1.displayInfo();
	        System.out.println();

	        System.out.println("Person 2:");
	        person2.displayInfo();

	}

}

class Person {
    String name;
    int age;

    // Constructor (with parameters)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}