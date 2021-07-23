package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.A06_HikariCP;
import jdbc.model.EmJoinDe;

public class A07_DataJoinModel {
	public static void main(String[] args) {
		String sql = "SELECT * FROM employees"
				+ " JOIN departments USING(department_id)"
				+ " ORDER BY employee_id";
		
		ArrayList<EmJoinDe> list = new ArrayList<>();
		
		try (
			Connection conn = A06_HikariCP.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		){

			while(rs.next()) {
				list.add(new EmJoinDe(
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("phone_number"),
						rs.getDate("hire_date"),
						rs.getString("job_id"),
						rs.getInt("salary"),
						rs.getInt("manager_id"),
						rs.getInt("department_id"),
						rs.getString("department_name"),
						rs.getInt("location_id")
				));
			}
			
			System.out.println(list);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
