package ketnoi;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class DataBaseMetaData {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//Thong tin cua database
		
		Connection conn = ConnectMysql.getConnect();
		
		DatabaseMetaData databaseMetaData = conn.getMetaData();
		
		System.out.println(databaseMetaData.getDatabaseProductName());
		System.out.println(databaseMetaData.getDatabaseProductVersion());
		System.out.println(databaseMetaData.getUserName());
		System.out.println(databaseMetaData.getURL());

	}

}
