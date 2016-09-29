import samples.Animal;
import samples.Counter;
import samples.Dog;
import samples.Vehicle;

public class MyClass {
	public static void main(String[] args) {
		Vehicle.horn();
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("green");
		System.out.println(v1.getColor());
		System.out.println(v2.getColor());
		
		@SuppressWarnings("unused")
		Counter c1 = new Counter();
		@SuppressWarnings("unused")
		Counter c2 = new Counter();
		System.out.println(Counter.COUNT);
		
		Animal dog = new Animal();
		dog.bark();
		
		Dog doggy = new Dog();
		doggy.eat();
	}
}
