package class11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementAPI {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String dbURL="jdbc:mysql://localhost:3306/hplus?user=root&password=sanjana";
			conn = DriverManager.getConnection(dbURL);
			if (conn != null) {
				System.out.println("Connection established using Connection connector");
			}
			String query = "UPDATE emp_tab set job=? WHERE empno = ?";
			ps = conn.prepareStatement(query);
			ps.setString(1, "KING2");
			ps.setInt(2, 7001);
			int rows = ps.executeUpdate();
			
			
		    if(rows!=0) System.out.println("Update Completed Successfully");
		    else System.out.println("Update could not be found");
		    String selectQuery = "SELECT * from emp_tab WHERE empno=?";
			ps = conn.prepareStatement(selectQuery);
			ps.setInt(1, 7001);
			
			
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" +rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
