package day2;
import java.util.Scanner;
/*2:Write a program which will accept student information like rollno,name,5
 *  subject marks.calculate total and percentage.calculate grade.. 
           per >75 grade :A
           per<74 and >60 :B
           per<59  :C
*/
public class Que2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the roll no");
	
	int roll = sc.nextInt();
	System.out.println("roll no is" + roll);
	System.out.println("enter the name");
	
	String name = sc.next();//doubt
	System.out.println("name is" + name);
	System.out.println("enter the 5 subject marks in array ");

	int n =sc.nextInt();
int subject[] = new int[n];

System.out.print("enter all the element of array as marks of individual sub");
for(int i=0;i<5;i++) {
		subject[i]= sc.nextInt();
	}
	sc.close();
	
	calculation(subject);
	
	}


public static void calculation(int [] sub) {
	int sum=0;
	int per=0;
	for(int i =0;i<5;i++) {
		 sum = sum + sub[i];
	}
	per = sum/100;
		
	System.out.println("grade is");
		if(per>75) {
		System.out.println('A');
	}
	else if(per<75) {
		System.out.println('B');
	}
	else if(per<64) {
		System.out.println('C');
	}
}


}