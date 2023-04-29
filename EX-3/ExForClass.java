class ExForClass
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.sum(10,20);
	}
}
class A
{
	public void sum(int a,int b)
	{
		System.out.println("sum is :"+(a+b));
	}
}