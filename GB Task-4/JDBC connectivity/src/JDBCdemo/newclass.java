/*load the JDBC driver.
* Establish a connection to the database.
* Create a statement.
* Execute a query or update.
* Process the results.
* Close the connection.
**/ 


package JDBCdemo;
import java.sql.*;
public class newclass {

	public static void main(String[] args) throws ClassNotFoundException{
		
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String password = "manav@MySQL123";
		String query = "Select*from employees;";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers loaded succesfully !!!");
			
		}catch (ClassNotFoundException e){
			System.out.println(e.getMessage());
		}
		
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established successfully !!!");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String job_title = rs.getString("job_title");
				double salary = rs.getDouble("salary");
				
				System.out.println("---------------------");
				System.out.println("ID : " +id );
				System.out.println("Name : " +name );
				System.out.println("Job_title : " +job_title );
				System.out.println("Salary : " +salary );
				
			}
			System.out.println("---------------------");
			rs.close();
			stmt.close();
			con.close();
			System.out.println("Connection closed successfully !!!");
			
		} catch (SQLException e){
			System.out.println(e.getMessage());
		}

	}

}
