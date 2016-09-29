package samples;

abstract class Animal {
	protected int legs;
	
	public void eat() {
		System.out.println("Animal eats.");
	}
	
	abstract void makeSound();
}
