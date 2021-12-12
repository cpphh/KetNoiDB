package ketnoi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPreparedStatement {
	public static void insertPerson(int id, String ten) {
		Connection conn = ConnectMysql.getConnect();
		String sql = "insert into person(id, ten) values(?,?)";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, ten);
			
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void updatePerson(int id, String ten) {
		Connection conn = ConnectMysql.getConnect();
		String sql = "update person set ten = ? where id = ?";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, ten);
			preparedStatement.setInt(2, id);
			
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void deletePerson(int id) {
		Connection conn = ConnectMysql.getConnect();
		String sql = "delete from person where id = ?";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			int rs = preparedStatement.executeUpdate();
			System.out.println(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insertPerson(5, "E");
		updatePerson(3, "G");
		deletePerson(4);
	}

}
