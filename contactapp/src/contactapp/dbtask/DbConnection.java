package contactapp.dbtask;

import java.sql.*;

public class DbConnection
{
	
private  static Connection con;

public static Connection createConnection()
{
	try {
		//Calendar c=Calendar.getInstance();
		
		//Class.forName("com.mysql.cj.jdbc.Driver");//factory methods
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_db","root","root");
		
		//DriverManager.getConnection("protocol:"//this is the name or ipaddress of the machine where db has been installed:portnumber/dbname,"userid,""password")
	}
	catch(SQLException cse)
	{
		cse.printStackTrace();
	}

	return con;
}

public static void closeConnection()
{
	if(con!=null)
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
}

}
