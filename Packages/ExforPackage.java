import ownPackage.*;
class ExforPackage
{
public static void main(String args[])
{
	float c;
	ExMath obj=new ExMath();
	c=obj.add(10,5);
	System.out.println("Addition is "+c);
	c=obj.sub(10,5);
	System.out.println("Subtraction is "+c);
	c=obj.mul(10,5);
	System.out.println("Mltiplication is "+c);
	c=obj.div(10,5);
	System.out.println("Division is "+c);
}
}
