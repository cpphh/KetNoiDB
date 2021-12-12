package ketnoi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DocFile {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Connection conn = ConnectMysql.getConnect();
		String sql = "select * from file";
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		ResultSet rs = preparedStatement.executeQuery();
		while(rs.next()) {
			String name = rs.getString("name");
			Blob file = rs.getBlob("file");
			byte[] b = file.getBytes(1, (int) file.length());
//			for(byte by : b)
//				System.out.print(by);
			
			FileOutputStream fileOutputStream = new FileOutputStream(name);
			fileOutputStream.write(b);
			fileOutputStream.close();
		}
		System.out.println("doc tu Database va ghi vao file thanh cong");

	}

}
