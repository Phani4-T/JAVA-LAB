public class ExforUserdefined {
    public static void main(String args[])
    {
        try
        {
            throw new Myexcep("Own Exception..");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Myexcep extends Exception
{
    Myexcep(String s1)
    {
        super(s1);
    }
}
