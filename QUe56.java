package day2;

import java.util.Scanner;

/*5:Write a program to accept array of 5 numbers and display it.

6:Write a program which read aaray of 5 elements and print reverse array.
7:wap to find index of number in array if present else show not exist
*/
public class QUe56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	System.out.println("enter the number to find in array");
	int num = s.nextInt();
	int a[] = new int[n]; 
	for(int i:a) {									
		System.out.println("enter the a number");
	 i = s.nextInt(); // a[i] for traditional for loop

}//for
	
	
	
	display(a);	
	reverse(a);
	
	s.close();
	}//main
 
	public static void display(int a[])
	{
		for(int i:a)
		{
			System.out.println(i+ " "); //a[i] for traitional loop
		}
	}

	
	public static void reverse(int a[])
	{
	System.out.println("u have entered in reverse function");
		
		int i=0;
		int j=a.length-1;
		System.out.println( i +" " + j);
	while(i<=j)
	{
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	 i++;
	 j--;
	}
	for(int d=0;d<a.length;d++) {
	System.out.println(a[d]);
	}
	}
	
	

}// class
