package Assesment;

public class Pclass {

	//public static void main(String[] args) {
		public void pmethod()
		{
			System.out.println("This is parent class");
		}
}
class Cclass extends Pclass{
	public void cmethod() {
		System.out.println("This is child class");
	}
}
class Ans {
	public static void main(String[] args) {
		Pclass m = new Pclass();
		Cclass n = new Cclass();
		m.pmethod();
		n.cmethod();
		n.pmethod();
	}
}

		
		