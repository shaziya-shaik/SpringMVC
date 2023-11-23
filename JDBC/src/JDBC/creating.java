package JDBC;
/*
 * 1.import java.sql
 * 2.load and register the driver-> com.mysql.jdbc.Driver
 * 3.create connection
 * 4.create statement
 * 5.execute the query
 * 6.process the result
 * 7.close*/
import java.sql.*;
public class creating {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/practice";
		String name="root";
		String pass="";
		String query="SELECT * FROM customers;";
		//String query1="insert into customers values(?,?,?,?,?);";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,name,pass);
		Statement st=con.createStatement();
		//PreparedStatement st=con.prepareStatement(query); //work with pre defined statements but values changed then use prepared statements
		//st.setInt(1, Id);
		//st.setString(2,name);
		//ResultSet rs=st.executeQuery();
		//int rows=st.executeUpdate(query1);//update number of rows effected
		ResultSet rs=st.executeQuery(query);//DQL 
		
		//System.out.println(rows);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"   "+rs.getInt(3)+"  "+ rs.getString(4)+"  "+rs.getInt(5));
		}
		st.close();
		con.close();

	}

}
