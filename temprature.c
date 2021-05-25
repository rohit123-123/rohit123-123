#include<stdio.h>
void temp(double);
void main()
{
	double c;
	 printf("enter the value for c ");
	 scanf("%lf",&c);
	
	 temp(c);

}
 void temp(double c){
 	
	 
	 double f;
 	f = 32 + (c*9/5);
 printf("%lf",f);
 }
