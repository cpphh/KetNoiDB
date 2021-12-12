package ketnoi;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class CreateStatment {
	public static void createTable() {
		Connection conn = ConnectMysql.getConnect();
		try {
			Statement statement = (Statement) conn.createStatement();
			
			String sql = "create table person(id int, ten varchar(30), primary key (id))";
			int i = statement.executeUpdate(sql);
			
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void dropTable() {
		Connection conn = ConnectMysql.getConnect();
		try {
			Statement statement = (Statement) conn.createStatement();
			
			String sql = "drop table person";
			int i = statement.executeUpdate(sql);
			
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createTable();
		//dropTable();

	}

}
