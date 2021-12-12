package ketnoi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class JDBCStatement {

	public static void main(String[] args) {
		Connection conn = ConnectMysql.getConnect();
		try {
			Statement statement = (Statement) conn.createStatement();
			
			String sql = "select * from demo where id = 2";
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				
				System.out.println(id + " " + name);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
