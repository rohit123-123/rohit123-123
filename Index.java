package day2;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n =s.nextInt();
		int a []=new int[n];
		System.out.println("enter the numbers in array");
		for(int i =0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("enter the number to find in array");
		int num =s.nextInt();
		index(a,num);
		
			
	}

	public static void index(int a[],int num)
	{
		int i;
		for( i =0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				System.out.println("index is" +i+ " ");
				break ;
			}
		
		} 
		if(i==a.length)
		{
			System.out.println("not exist");
		}
	}



}
