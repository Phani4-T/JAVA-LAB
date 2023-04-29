class ExForException
{
	public static void main(String args[])
	{
		try
		{
			String ab=null;
			System.out.println(ab.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("NULL value size cant be printed");
		}
		System.out.println("Next Statement");
	}
}