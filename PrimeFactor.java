package day1;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		
		//PrimeFactor(n);
		efficientPrimeFactor( n);
		}
		public static boolean isPrime(int n)
			{
				if(n==1) {
					return false;
					}
				if(n==2 || n==3)
				{
					return true;
				}
					if(n%2==0 || n%3==0)
					{
						return false;
					}
				int i;
				for( i=5;i*i<=n;i+=6 ) 
				{
						if(n%i==0 || n%(i+2)==0) 
						{
							return false;
						}
									
				}
			return true;
			}

		public static void PrimeFactor(int n)
		{
			if(n<=1)
			{
				return ;
			}
			for(int i =2;i*i<=n;i++) 
			{	
				{
					
					while(n%i==0)
					{
						System.out.println(i+ " ");
					n=n/i;
					}
				}
			}
			if(n > 1)
				System.out.print(n+" ");

			System.out.println();
		}

		
		public static void efficientPrimeFactor(int n)
		{
			while(n%2==0)
			{
				System.out.println(2);
				n=n/2;
			}
		for(int i =3;i*i<=n;i+=2)
		{
			while(n%i==0)
			{
				System.out.println(i);
			n=n/i;
			}
		}
		if(n>3) {
			System.out.println(n);
		}
		}
}

	
			
			
		
	


