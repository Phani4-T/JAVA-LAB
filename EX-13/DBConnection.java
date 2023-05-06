
import java.sql.*;
class DBConnection 
{
    public static void main(String args[])
    {
        try
        {
                Connection con=DriverManager.getConnection("jdbc:mysql://itserver2:3306/22b95a5418","root", "root");
                Statement st=con.createStatement();
                String q1="SELECT * FROM stddetails";
                ResultSet r1=st.executeQuery(q1);
                while(r1.next())
                {
                    System.out.println(" "+r1.getString(1)+" "+r1.getString(2)+" "+r1.getString(3));

                }
                con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
