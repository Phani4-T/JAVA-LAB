class Exformoverloading
{
	public static void main(String args[])
	{
	 Foroverload obj=new Foroverload();
	 int x=obj.area();
	 System.out.println(" Area is :"+x);
	 Foroverload obj1=new Foroverload();
	 int y=obj1.area(5,4);
	 System.out.println(" Area is using parameters :"+y);	
	}
}
class Foroverload
{
	int a=10,b=20;
	int area()
	{
		return a*b;
	}
	int area(int len,int bre)
	{
		return len*bre;
	}
}