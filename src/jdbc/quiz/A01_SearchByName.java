package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class A01_SearchByName {
	/*
		# 사용자로 부터 문자열을 입력받으면 해당 문자열이 이름에 포함된 
		  모든 사원을 조회해 보세요
	 */
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 단어를 입력해주세요:");
		String ustr = scan.nextLine().toUpperCase();
		String lstr = ustr.toLowerCase();
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			System.out.println("해당 라이브러리 찾을 수 없음");
		}
		
		Connection conn;
		try {
			 conn= DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/XEPDB1",
				"hr",
				"1234"
			);
			 String sql = "SELECT * FROM employees"
			 		+ " WHERE last_name LIKE '%"+ustr+"%' or last_name LIKE '%"+lstr+"%'";
			 PreparedStatement pstmt = 
					 conn.prepareStatement(sql);
			 
			 ResultSet rs = pstmt.executeQuery();
			 
			 while(rs.next()) {
				 System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\t%d\t%f\t%d\t%d\n",
						 rs.getInt("employee_id"),
						 rs.getString("first_name"),
						 rs.getString("last_name"),
						 rs.getString("email"),
						 rs.getString("phone_number"),
						 rs.getDate("hire_date"),
						 rs.getString("job_id"),
						 rs.getInt("salary"),
						 rs.getDouble("commission_pct"),
						 rs.getInt("manager_id"),
						 rs.getInt("department_id"));
			 }
			 
			 rs.close();
			 pstmt.close();
			 conn.close();
			 
		}catch(SQLException e) {
			e.printStackTrace();			
		}
		
		System.out.println("main 끝");
	}
}
