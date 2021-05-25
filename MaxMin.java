package day2;

import java.util.Scanner;

public class MaxMin {

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
		
	sumAverage(a);	
	
	int max=Integer.MIN_VALUE;
	int min =Integer.MAX_VALUE;
	for(int i =0;i<a.length;i++) {
		if(max<a[i])
		{
			max=a[i];
		}
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("max is ="+max+ " and min is="+min);
	
	}
public static void sumAverage(int a[])
{
	int sum =0;
	double avg;
	for(int i =0;i<a.length;i++)
	{
		sum=sum+ a[i];
		
	}
avg = (double)sum/a.length;

System.out.println("sum is "+ sum+ "and avg is "+ avg);

}
}
