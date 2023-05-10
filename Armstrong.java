//import java.lang.Math;// i have to do this with math class.
import java.util.*;
class Armstrong
{
  public static void main(String args[])
  {
	int n=153,r;
	int temp=n;
	int sum=0;
	while(n>0)
	{
		r=n%10;
		r=n/10;
		sum = sum + r*r*r;
	}
	if(temp == sum)
		System.out.println("It is an armstrong number");
	else
		System.out.println("It is not an armstrong number");	
 }
} 
//int n=153,temp,Armstrong=0;
	//int original=n;
	//while(n>0)
	//{
		//temp=n%10;
		//temp=Math.pow(temp,3);
		//Armstrong=Armstrong+temp;
		//n=n/10;
	//}