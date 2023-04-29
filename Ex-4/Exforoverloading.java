class Exforoverloading
{
	public static void main(String args[])
	{
		ExConstructor obj=new ExConstructor();
		int x=obj.sum();
		System.out.println("with Default constructor is:"+x);
		ExConstructor obj1=new ExConstructor(50,60);
		int y=obj1.sum(); 	
		System.out.println("with Default constructor is:"+y);
	}
}
class ExConstructor
{
	int a,b;
	ExConstructor()
	{
		a=10;
		b=20;
	}
	ExConstructor(int len,int bre)
	{
		a=len;
		b=bre;
	}
	int sum()
	{
		return(a+b);
	}
}