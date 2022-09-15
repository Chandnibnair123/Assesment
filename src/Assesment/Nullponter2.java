package Assesment;

public class Nullponter2 {
	private static void printLength(String str) {
		System.out.println(str.length());
	}
	public static void main(String ags[]) {
		String myString=null;
		printLength(myString);
	}
	}