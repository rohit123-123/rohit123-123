package day1;

import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A ="hello";
		String B ="hi";
		 int a = A.length() + B.length();
		    System.out.println(a);
		    
		        
		        int result = A.compareTo(B);
		        if(result<0){
		            System.out.println("No");
		        }
		        else {
		            System.out.println("Yes");
		        }
		        String C = A.substring(0,1).toUpperCase() + A.substring(1);    
		        String D = B.substring(0,1).toUpperCase() + B.substring(1);
		   System.out.println(C + " " + D);
		    }
	}
	


