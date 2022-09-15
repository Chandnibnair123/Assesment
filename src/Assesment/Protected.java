package Assesment;

class Modifiers {
	protected String fname="Chandni";
	protected String lname="Balachandran";
	protected int age = 23;
}
class Protected extends Modifiers{
	private String course = "MCA";
	public static void main(String[] args) {
		Protected myObj=new Protected();
		System.out.println("name:="+myObj.fname+""+myObj.lname);
		System.out.println("age:"+myObj.age);
		
	}
}


	