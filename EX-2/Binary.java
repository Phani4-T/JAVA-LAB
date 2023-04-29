import java.util.*;
import java.io.*;
class Binary
{
	public static int binsearch(int a[],int low,int high,int k)
	{
		int mid=0;
		while(low<=high)
		{
		mid=(low+high)/2;
		if(a[mid]==k)
		{
			return mid;
		}
		else if(a[mid]<k)
		{
			low=mid+1;
		}
		else
		{
			high=mid-1;
		}
		}
		return -1;
	}
	public static void main(String args[])
	{
		int n,k,r;
		System.out.println("Enter n value:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[10];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Key value To Search:");
		k=sc.nextInt();
		r=binsearch(a,0,n,k);
		if(r==-1)
		{
			System.out.println("ELEMENT NOT FOUND");
		}
		else
		{
			System.out.println("ELEMENT FOUND AT:"+(r+1));
		}
	}
}