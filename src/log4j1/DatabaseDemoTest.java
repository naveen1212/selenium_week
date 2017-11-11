package log4j1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDemoTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 
	{
         
		String dburl,uid,pwd, dbdriver;
		
		dburl="jdbc:sqlserver://primusbank.qedgetech.com:1433;database=bankdb";
		uid="qedge";
		pwd="qedge";
		dbdriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		

	Class.forName(dbdriver).newInstance();
	
	
	
	Connection dbcn;
	
	
	dbcn=DriverManager.getConnection(dburl,uid,pwd);
	
	//PreparedStatement  gg=dbcn.prepareStatement("select *frrrrr");
	//gg.executeQuery();
	
	
   Statement stmt=dbcn.createStatement();
   ResultSet rs=stmt.executeQuery("select * from bankbranches");
   
   
   while(rs.next())
   {
   	int brid=rs.getInt(1);
   	String brname=rs.getString(2);
   	String add2=rs.getString(3);
   	
   	System.out.println(brid+"       "+brname+ "        "+add2);
   	}
   rs.close();
   dbcn.close();
   
 
   
	
	
	}

}

















//Class.forName("").newInstance();
	//	Connection dub = DriverManager.getConnection(url, user, password);
	//	Statement st = db.createStatement();
	//	ResultSet rs = st.executeQuery("")







/*  ResultSet res=stmt.executeQuery("select max(branched) from bankbranches");

rs.next();
int max= rs.getInt(1);
System.out.println(max);

rs.close(); */