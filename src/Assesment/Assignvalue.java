package Assesment;
class L
{
	int i;
	public void printNum() {
		System.out.println(i);
	}
}
class J extends L
{
	int j;
	public void printNum() {
		System.out.println(j);
	}
}
class Assignvalue
{
	public static void main(String[] args)
	{
		J a = new J();
		a.i = 5;
		a.j = 7;
		a.j = a.i;
		a.printNum();
	}
}
		
	
	
	


		

