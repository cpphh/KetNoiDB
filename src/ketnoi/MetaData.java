package ketnoi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaData {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//Lay thong cac thong tin cua bang Demo
		
		Connection conn = ConnectMysql.getConnect();
		Statement statement = conn.createStatement();
		
		String sql = "select * from demo";
		ResultSet rs = statement.executeQuery(sql);
		
		//Lay so ban ghi cua bang
		//rs.last();
		//System.out.println(rs.getRow());
		
		ResultSetMetaData metaData = rs.getMetaData();
		
		System.out.println(metaData.getTableName(1));
		System.out.println(metaData.getColumnCount());
		System.out.println(metaData.getColumnName(1));
		System.out.println(metaData.getColumnTypeName(1));
		System.out.println(metaData.getColumnName(2));
		System.out.println(metaData.getColumnTypeName(2));
		

	}

}
