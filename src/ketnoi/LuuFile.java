package ketnoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LuuFile {

	public static void main(String[] args) throws FileNotFoundException, SQLException {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		
		Connection conn = ConnectMysql.getConnect();
		String sql = "insert into file(name, file) values (?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1, "ketNoi2.txt");
		preparedStatement.setBinaryStream(2, fileInputStream);
		
		preparedStatement.executeUpdate();
		System.out.println("them thanh cong");
		
	}

}
