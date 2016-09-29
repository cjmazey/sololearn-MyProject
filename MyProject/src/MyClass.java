import samples.Animal;
import samples.Counter;

public class MyClass {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		System.out.println(Counter.COUNT);
		
		Animal dog = new Animal();
		dog.bark();
	}
}
