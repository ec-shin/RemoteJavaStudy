package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class A04_SQLInjection {
	// coffee ���̺� SQLInjection�� �������Ѻ�����. (�Ϻη� ?�� ������� �ʾƾ���)
	// �⺻ ������ Ŀ�ǰ����� 3000-4000 ������ Ŀ�Ǹ� �˻��ϴ� ���
	static String driverName = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	static String user = "hr";
	static String password = "1234";
	
	static {
		try {
			Class.forName(driverName);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		String id= "3 or 1=1";
		String sql = "DELETE FROM coffee WHERE id=" + id;
		
		
		try(
			Connection conn = DriverManager.getConnection(url, user, password);				
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			Statement statement = conn.createStatement();
			int rows = statement.executeUpdate(sql);

			System.out.println("done.");
	

		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}









