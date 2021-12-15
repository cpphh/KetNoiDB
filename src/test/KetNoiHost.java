package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KetNoiHost {
	public static Connection getConnect() throws ClassNotFoundException, SQLException {
	    //Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/ror17233db", "ror17233", "ror17233@zwoho.com");
	    
		return conn;
	}

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		//Remote Mysql moi ket noi duoc
		
		long startTime = System.currentTimeMillis();
		
		Connection conn = getConnect();
		String sql = "select * from person";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		//preparedStatement.setInt(1, 2);
			
		ResultSet rs = preparedStatement.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("id")+rs.getString("name"));
		}
			
		System.out.println("Total execution time: " + (System.currentTimeMillis() - startTime));
	}
}
