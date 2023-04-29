class Exforsuper
{
public static void main(String args[])
{
Ex2 obj=new Ex2();
int r=obj.volume();
System.out.println("Volume is "+r);
}
}
class Ex1
{
int l,b;
Ex1()
{
l=10;
b=20;
}
}
class Ex2 extends Ex1
{
int h;
Ex2()
{
super();
h=30;
}
int volume()
{
return l*b*h;
}
}