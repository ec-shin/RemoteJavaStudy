package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A01_JdbcConnection {
	/*
		# JDBC
			- JAVA Database Connectivity.  자바 데이터베이스 연결
			- DB에 쿼리문을 전달하여 실행하고 결과를 받아오는 JAVA API
			- Java쪽 소스코드는 어떤 db와도 연결될 수 있도록 설계되어있다
			- DB를 제작한 쪽에서 JDBC를 요구하는 형태에 맞춰서 자바와의 연결울
			  구현하기 때문에 자바 프로그래먼들은 새로운 DB도 쉽게 사용할 수 있다
		
		# OJDBC
			- 오라클 데이터베이스가 JDBC API와 소통하기 위해 만든 라이브러리
			- 오라클 DB가 설치된 폴더 내부에 포함되어있다 
			  
	*/
	public static void main(String[] args) {
		
		// 1. Class.forName() 으로 jdbc드라이버를 로드한다
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			System.out.println("해당 라이브러리 찾을 수 없음");
		}
		
		// 2. DriverManager 클래스를 통해 DB에 연결한다
		Connection conn;
		try {
			 conn= DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/XEPDB1",
				"hr",
				"1234"
			);
			 /*
			  3. 생성된 연결을 객체에 전송하고자 하는 쿼리문을 담아 놓는다
			     단 쿼리문에 ;를 넣으면 실해되지 않는다
			 */
			 String sql = "SELECT employee_id, last_name, salary, department_name"
					 	+ " FROM employees INNER JOIN departments USING(department_id)"
					    + " ORDER BY employee_id ASC";
			 PreparedStatement pstmt = 
					 conn.prepareStatement(sql);
			 
			 /*
				4. 준비해 놓은 쿼리문을 실행한다.
				   SELECT문은 execureQuery() 메서드를 사용해야 하고
				   INSERT,  UPDATE, DELETE는 executeUpdate() 메서드를 사용해야 한다			
			*/
			 ResultSet rs = pstmt.executeQuery();
			 

			//5. 받아온 쿼리 결과를 사용한다
			 while(rs.next()) {
				 System.out.printf("%d\t%s\t%d\n",
						 rs.getInt("employee_id"),
						 rs.getString("last_name"),
						 rs.getInt("salary"),
						 rs.getString("department_name"));
			 }
			 
			 // 6. 다 사용한 JDBC 객체를 나중에 생성한 순서대로 닫아준다.
			 rs.close();
			 pstmt.close();
			 conn.close();
			 
		}catch(SQLException e) {
			e.printStackTrace();			
		}
		
		System.out.println("main 끝");
	}
}















