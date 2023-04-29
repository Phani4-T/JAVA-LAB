public class ExForConst
{
	
	public static void main(String args[])
	{
		Cons obj=new Cons();
		int s=obj.sum();
		System.out.println(+s);
	}
}
class  Cons
{
	int a, b;
	Cons()
	{
		a=10;
		b=20;
	}
	int sum()
	{
		return((a+b));
	}

}