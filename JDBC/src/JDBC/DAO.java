package JDBC;
import java.sql.*;
public class DAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		StudentDAO dao=new StudentDAO();
		dao.connect();
		Student s1=dao.getStudent(108);
		
		System.out.println(s1.name);

	}
	static class StudentDAO{
		Connection con;
		public void connect() throws ClassNotFoundException, SQLException {
			String url="jdbc:mysql://localhost:3306/practice";
			String user="root";
			String pass="";
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection(url,user,pass);
		}
		public Student getStudent(int rollno) throws ClassNotFoundException, SQLException {
			Student s=new Student();
			s.rollno=rollno;
			
			String query="SELECT  NAME FROM CUSTOMERS WHERE ID_NUM=?;";
			
			
			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.setInt(1, rollno);
			 ResultSet rs = preparedStatement.executeQuery();
			rs.next();
			String name=rs.getString(1);
			s.name=name;
			return s;
		}
		public int addStudent() {
			return 0;
		}
	}
	static class Student{
		int rollno;
		String name;
	}

}
