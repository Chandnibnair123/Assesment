package Assesment;

public class Prime1 {

	public static void main(String[] args) {
		int ct=0,n=0,i=1,j=1;
		
		while(n<25)
		{
			j=1;
			ct=0;
			while(j<=i)
			{
				if(i%j==0)
					ct++;
				j++;
			}
			System.out.printf("%d",i);
			n++;
		}
		i++;
	}
}

		
			
			
		
		
		
		

	

