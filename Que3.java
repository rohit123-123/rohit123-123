package day2;
// swap two numbers
public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a= 10;
int b =20;
	
	swap(a,b);
	}
 public static void swap(int a, int b) {
	 a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a + "and" + b); 
 }
}
