package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.DBConnector;

public class A07_DataJoinModel2 {
	public static void main(String[] args) {
		
		String sql = "SELECT * FROM employees INNER JOIN departments USING (department_id)";
		
		try (
				Connection conn = DBConnector.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
			){
				

			} catch (SQLException e) {
				e.printStackTrace();
			} 
	}
}












