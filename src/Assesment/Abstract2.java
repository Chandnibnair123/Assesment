package Assesment;

abstract class Animal
{
	public abstract void printSound();
	public void displayInfo() {
		System.out.println("I am an Animal");
		
	}
}
class Dog extends Animal{
	public void printSound() {
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal{
	public void printSound() {
		System.out.println("cat meow");

	}
}
public class Abstract2
{
	public static void main(String args[])
	{
		Dog d = new Dog();
		Cat c = new Cat();
		d.printSound();
		d.displayInfo();
		c.printSound();
		c.displayInfo();
	}
}
		
		
		
			
		
		
	

	