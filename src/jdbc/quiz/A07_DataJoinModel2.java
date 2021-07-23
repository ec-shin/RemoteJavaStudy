package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.DBConnector;
import jdbc.model.Department;
import jdbc.model.Employee;

public class A07_DataJoinModel2 {
	public static void main(String[] args) {
		
		String sql = "SELECT "
				+ " e.*, "
				+ " d.* , "
				+ " e.manager_id AS mid1, "
				+ " d.manager_id AS mid2"
				+ " FROM employees e, departments d"
				+ " WHERE e.department_id = d.department_id";
		ArrayList<Employee> list = new ArrayList<>();
		
		try (
				Connection conn = DBConnector.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
			){
			while(rs.next()) {
				list.add(new Employee(
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("email"),
						rs.getString("phone_number"),
						rs.getDate("hire_date"),
						rs.getString("job_id"),
						rs.getDouble("salary"),
						rs.getDouble("commission_pct"),
						rs.getInt("mid1"),
						rs.getInt("e.department_id"),
						new Department(
								rs.getInt("d.department_id"),
								rs.getString("department_name"),
								rs.getInt("mid2"),
								rs.getInt("location_id")
						)
				));
			}

			} catch (SQLException e) {
				e.printStackTrace();
			} 
	}
}
//











