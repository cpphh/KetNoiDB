package ketnoi;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchJDBC {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = ConnectMysql.getConnect();
		
		String sql1 = "insert into demo(id, name) values (10,'R')";
		String sql2 = "insert into demo(id, name) values (11,'R')";
		String sql3 = "insert into demo(id, name) values (12,'R')";

		Statement statement = conn.createStatement();
		statement.addBatch(sql1);
		statement.addBatch(sql2);
		statement.addBatch(sql3);
		
		//conn.setAutoCommit(false);
		int[] i = statement.executeBatch();
		//conn.commit();
		for(int in : i)
			System.out.println(in);

	}

}
