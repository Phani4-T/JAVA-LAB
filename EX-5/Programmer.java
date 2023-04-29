class Employee
{
int oldsalary=50000;
int newsalary=60000;
}
class Programmer extends Employee
{
public static void main(String args[])
{
Programmer obj=new Programmer();
float hike;
hike=(((obj.newsalary-obj.oldsalary)/obj.oldsalary)*100);
System.out.println("Hike percentage is :"+hike);
System.out.println("New Salary is :"+obj.newsalary);
}
}