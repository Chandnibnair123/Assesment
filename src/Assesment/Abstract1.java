package Assesment;
abstract class Parent
{
	void message() {}
}
class Subclass1 extends Parent
{
	void message() {
		System.out.println("This is the first subclass");
	}
}
class Subclass2 extends Parent
{
	void message() {
		System.out.println("This is the second subclass");
	}
}
public class Abstract1
{
	public static void main(String args[])
	{
		Subclass1 sb1 = new Subclass1();
		Subclass2 sb2 = new Subclass2();
		sb1.message();
		sb2.message();
	}
}


	


