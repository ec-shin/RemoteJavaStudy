package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A03_Transaction {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String user = "hr";
		String password = "1234";
		String sql1 = "UPDATE coffee SET price=price-100";
		String sql2 = "SELECT count(*) AS m_count FROM coffee WHERE price < 0";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection(url, user, password);
			
			// AutoCommit을 꺼야 직접 트랜잭션을 관리할 수 있다
			conn.setAutoCommit(false);
			
			PreparedStatement pstmt = conn.prepareStatement(sql1);
			
			// 첫 번째 쿼리문은 UPDATE이기 때문에 executeUpdate()를 실행하면 몇행이 변했는지 int로 알려줌
			int update_rows = pstmt.executeUpdate();
			
			if(update_rows==0) {
				pstmt.close();
				conn.close();
				return;
			}else {
				System.out.println(update_rows + "row(s) change");
			}
			
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			
			// 두 번쨰 쿼리문은 SELECT문이기 때문에 executeQuery()로 실행하면 SELECT 결과가 ResultSet으로 반환
			ResultSet rs = pstmt2.executeQuery();
			
			//rs.next()는 읽을 값이 남아 있는지 체크한후 읽을 값이 있아면 커서를 다음으로 옮기는 메서드
			rs.next();
			
			//그룹 함수를 적용한 쿼리문이라 결과가 한 행만 나올것이기 때문에 반복문을 굳이 사용하지 않음
			int minus_rows = rs.getInt("m_count");
			
			if(minus_rows > 0) {
				System.out.println("음수가 된 가격이 있어서 모든 작업을 취소합니다.");
				conn.rollback();
			}else {
				System.out.println("음수가 된 가격이 없어서 작업을 확정짓습니다.");
				conn.commit();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}













