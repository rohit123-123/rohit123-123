package day1;import java.util.Scanner;

public class Addtionofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s = new Scanner(System.in);
	System.out.println("enter the two characters");
	char x = s.next().charAt(0);
	char y =s.next().charAt(0);
	String a ="" + x +y;
	System.out.println(a);
	}

}
