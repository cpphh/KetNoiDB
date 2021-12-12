package ketnoi;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertStatement {
	public static void insertPerson(int id, String ten) {
		Connection conn = ConnectMysql.getConnect();
		try {
			Statement statement = conn.createStatement();
			
			String sql = "insert into person(id, ten) values ("+id+", '"+ten+"')";
			int i = statement.executeUpdate(sql);
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void updatePerson(int id, String ten) {
		Connection conn = ConnectMysql.getConnect();
		try {
			Statement statement = conn.createStatement();
			
			String sql = "update person set ten ='"+ten+"' where id ="+id;
			int i = statement.executeUpdate(sql);
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deletePerson(int id) {
		Connection conn = ConnectMysql.getConnect();
		try {
			Statement statement = conn.createStatement();
			
			String sql = "delete from person where id = "+id;
			int i = statement.executeUpdate(sql);
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//insertPerson(2, "B");
		//updatePerson(2, "C");
		deletePerson(2);

	}

}
