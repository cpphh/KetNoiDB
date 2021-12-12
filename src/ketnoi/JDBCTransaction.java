package ketnoi;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTransaction {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//Neu bat ky sql khong thuc hien duoc thi phuc hoi trang thai ban dau
		
		Connection conn = ConnectMysql.getConnect();
		Statement statement = conn.createStatement();
		
		conn.setAutoCommit(false);
		
		String sql1 = "delete from demo where id = 1";
		String sql2 = "insert into demo(id, name) values(3,'C')";
		
		statement.executeUpdate(sql1);
		statement.executeUpdate(sql2);
		
		conn.commit();

	}

}
