/*Emily Hansson 
 * GitHub test code 
 * 11/6117
 */
public class HelloWorld {
	public static void main (String args[]){
		System.out.println("Hello there!");
		
		Person person = new Person("Bob");
		person.sayName();
		
		Student student = new Student("Jack");
		student.sayName();
	}
}
