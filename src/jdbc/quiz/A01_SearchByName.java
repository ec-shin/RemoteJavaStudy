package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class A01_SearchByName {
	/*
		# ����ڷ� ���� ���ڿ��� �Է¹����� �ش� ���ڿ��� �̸��� ���Ե� 
		  ��� ����� ��ȸ�� ������
	 */
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�˻��� �ܾ �Է����ּ���:");
		String ustr = scan.nextLine().toUpperCase();
		String lstr = ustr.toLowerCase();
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			System.out.println("�ش� ���̺귯�� ã�� �� ����");
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
		
		System.out.println("main ��");
	}
}
