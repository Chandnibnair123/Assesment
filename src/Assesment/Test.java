package Assesment;

class Shape{
	public void print_shape() {
		System.out.println("This is shape");
	}
}
class Rectangle1 extends Shape{
	
	public void print_rect() {
		System.out.println("This is rectangular shape");
	}
}
class Circle extends Shape{
	
	public void print_circle() {
		System.out.println("This is a circular shape");
	}
}
class Square extends Rectangle1{
	public void print_squ() {
		System.out.println("Square is a rectangle");
		
		
	}
}
class Test{
	public static void main(String[] args)
	{
		Square sq = new Square();
		sq.print_shape();
		sq.print_rect();
	}
}

		
	
	
	
	
	
