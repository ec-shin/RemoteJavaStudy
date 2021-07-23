package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.model.Coffee;

public class A07_DataModelClass {

	public static void main(String[] args) {
		// DB에서 꺼내온 데이터는 데이터 모델 클래스에 넣어 두는 것이 좋다.
		String sql = "SELECT * FROM coffee ORDER BY id";
		
		// 데이터 클래스를 제네릭으로 활용해 다양한 컬렉션을 쉽게 이용할 수 있다.
		ArrayList<Coffee> list = new ArrayList<>();
		
		try (
			Connection conn = A06_HikariCP.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		){

			while(rs.next()) {
				list.add(new Coffee(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getInt("price")
				));
			}
			
			System.out.println(list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}








