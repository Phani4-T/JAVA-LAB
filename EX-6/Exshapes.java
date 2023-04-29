import java.util.*;
abstract class Shape
{
int a,b;
abstract public void area();
}
class Rectangle extends Shape
{
int rectarea;
public void area()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter length and breath of rectangle:");
a=sc.nextInt();
b=sc.nextInt();
rectarea=a*b;
System.out.println("AREA of Rectangle is "+rectarea);
}
}
class Triangle extends Shape
{
double triarea;
public void area()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Base and Height of triangle:");
a=sc.nextInt();
b=sc.nextInt();
triarea=0.5*(a*b);
System.out.println("AREA of triangle is "+triarea);
}
}
class Square extends Shape
{
int squarearea;
public void area()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter side of Square:");
a=sc.nextInt();
squarearea=4*a;
System.out.println("AREA of square is "+squarearea);
}
}
public class Exshapes
{
public static void main(String args[])
{
Rectangle obj=new Rectangle();
obj.area();
Triangle obj1=new Triangle();
obj1.area();
Square obj2=new Square();
obj2.area();
}
}