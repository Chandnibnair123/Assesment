package Assesment;

public class ThrowThrows {

	static void checkAge(int age) throws 
	ArithmeticException{
		if(age <18)
		{
			throw new
			ArithmeticException("Access denied! You must be 18 yrs old");
		}
		else
		{
			System.out.println("Access granted!");
		}
	}
	public static void main(String[] args){
		checkAge(10);
		}
	}
	
		