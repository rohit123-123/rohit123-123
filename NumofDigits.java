package day1;

public class NumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5443435;

int c =(int) Math.floor(Math.log10(n)+1);
System.out.println(c);	

	String num = Integer.toString(n);
	System.out.println(num.length());
	}

}
