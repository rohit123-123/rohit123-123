package day1;
import java.util.Scanner;
public class Seive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s = new Scanner(System.in);
int n = s.nextInt();		
boolean a[] =new boolean[n+1];
	
	for(int i = 0;i<a.length;i++) {
		a[i]=true;
	}
	for(int p =2;p<=Math.sqrt(n);p++) {
		for(int j =p;j*p<=n;j++) {
			a[j*p]=false;
		}
	}
	for(int i=2;i<a.length;i++) {
		if(a[i]) {
			System.out.print(i+" ");
		}
	}
	
	}

}
