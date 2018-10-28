package code;
import java.sql.*;  
public class connect_mysql {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test","test","test");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from employees");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}
			catch(Exception e){ 
				System.out.println(e);  
			}  	
	}
}



