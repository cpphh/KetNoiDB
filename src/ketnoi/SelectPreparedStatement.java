package ketnoi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectPreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = ConnectMysql.getConnect();
		
		String sql = "select * from person where id = ?";
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, 2);
			
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+rs.getString("ten"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
