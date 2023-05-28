package Calc;
import java.util.Scanner;
public class simpleproject 
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int i,n,count=0;
	System.out.println("Enter the number:");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("Yes it is prime no");
	}
	else
	{
		System.out.println("No it is prime no");

	}
	
}
}
