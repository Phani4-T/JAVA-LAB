import java.util.*;
import java.io.*;
class Roots
{
	public static void main(String args[])
	{
		int a,b,c;
		float det;
		double r1,r2;
		System.out.println("Enter X^2 co-efficient:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter X co-efficient:");
		sc=new Scanner(System.in);
		b=sc.nextInt();
		System.out.println("Enter constant:");
		sc=new Scanner(System.in);
		c=sc.nextInt();
		det=b*b-4*a*c;
		if(det>0)
		{
			r1=(-b+(Math.sqrt(det)))/2*a;
			r2=(-b-(Math.sqrt(det)))/2*a;
			System.out.println("Roots are Positive!.2 Roots Exsists.");
			System.out.println("1st Root is :"+r1);
			System.out.println("1st Root is :"+r2);
		}
		else if(det==0)
		{
			r1=(-b/2*a);
			System.out.println("Both Roots are Same"+r1);
		}
		else
		{
			r1=-b/2*a;
			r2=((Math.sqrt(-det))/2*a);
			System.out.println("1st Root is :"+r1);
			System.out.println("2nd Root is :"+r2);
		}
	}
}