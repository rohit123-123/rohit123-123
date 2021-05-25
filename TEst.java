package day1;
import java.util.Scanner;
public class TEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
		 if((n&1)!=0)
		 {
			 System.out.println("weird");
		 }
		 	else if(n>=2 && n<=5 ) {
		 		System.out.println("not wird");
		 
			
		 }
		 	else if(n>=6 && n<=20) {
		 		System.out.println();  
					
				}
		 	else {
		 		System.out.println("not weird");
		 	}
	
	}
	}
	


