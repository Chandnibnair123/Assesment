package Assesment;

 class Degree {
	public void getDegree() {
		System.out.println("I got a Degree");
	}
}
	class Undergraduate extends Degree
	{
		public void getDegree() {
			System.out.println("I'm an Undergraduate");
		}
	}
	
			
		class Postgraduate extends Degree
		{
			public void getDegree() {
				System.out.println("I'm a Postgraduate");
			}
		}
		
		class Graduate {
			public static void main(String[] args)
			{
				
				Undergraduate a = new Undergraduate();
				Postgraduate b = new Postgraduate();
				a.getDegree();
				b.getDegree();
			}
		}
				
				
			