interface SurfaceArea
{
	double compute(double x);
}
class Square implements SurfaceArea
{
	public double compute(double x)
	{
		return x*x;
	}
}
class Circle implements SurfaceArea
{
	public double compute(double x)
	{
		return(3.14*x*x);
	}
}
class Faces 
{
	public static void main(String args[])
	{
		Square obj =new Square();
		Circle obj1=new Circle();
		SurfaceArea Area;
		Area=obj;
		System.out.println("Surface Area of Square is :"+Area.compute(20));
		Area=obj1;
		System.out.println("Surface area of circle is :"+Area.compute(10)); 
	}
}