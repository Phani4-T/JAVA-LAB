public class ExforBuiltinException {
    public static void main(String args[])
    {
        try{
            int a=10;
            int c=a/0;
            throw new ArithmeticException("Demo");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
                System.out.println("This is the finally block...");
        }
    }
}
