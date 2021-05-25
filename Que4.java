package day2;

import java.util.Scanner;

/*11:Write a menu driven program for stationary shop.Items are
 *  1:Pen 2:Pencil 3:NoteBook 4:Bottle 5:ColorBox.
    1 pen cost is 10Rs,Pencil is 5 rs.NoteBook is 20 rs 
    Bottle is 30 rs and ColorBox is at 50 Rs.
    Calculate Total of all purchesed items. 
*/
public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int p=0;
int pe=0;
int n=0;
int b=0;
int c =0;
		
		System.out.println("------Welcome to stationary shop-----");
		
		Scanner s = new Scanner(System.in);
		boolean flag=true;
		while(flag!=false) {
		
			System.out.println("Enter choice 1 for pen");
		System.out.println("Enter choice 2 for pencil");
		System.out.println("Enter choice 3 for notebook");
		System.out.println("Enter choice 4 for bottle");
		System.out.println("Enter choice 5 for colorbox");
		System.out.println("enter 6 for total amount and exit from menue");
		
		int choice = s.nextInt();
			
		
		switch(choice) {

			case 1: 
			     System.out.println("how many pens");
				  p=s.nextInt();
				
				 
				 
				 break;
			case 2:
				System.out.println("how many pencil");
			     pe= s.nextInt();
			break;
			case 3:
			    System.out.println("how many notebooks");
			     n= s.nextInt();
		
			    
			    break;
			case 4:
			    System.out.println("how many bottle");
			     b= s.nextInt();
		
		  
			    break;
			case 5:
			    System.out.println("how many colorbox");
			     c= s.nextInt();
		 
			    
			    break;
			case 6:
				 int total = p*10 + pe*5  + n*20 + 30*b + 50*c ;
				
					System.out.println("total is = " + total);
			System.out.println(" u have exited");
					flag = false;
					break;
			
			
			default:
				System.out.println("Invalid choice");
			
				
		
			
				 		}//swtich
			
			
			
		}//while
		
	}//main

}//class
