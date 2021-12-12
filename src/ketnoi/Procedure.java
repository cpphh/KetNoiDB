package ketnoi;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Procedure {

	public static void main(String[] args) throws SQLException {
		Connection conn = ConnectMysql.getConnect();
		CallableStatement callableStatement = conn.prepareCall("{ call findDemo(?) }");
		callableStatement.setInt(1, 3);
		
		ResultSet rs = callableStatement.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("id")+rs.getString("name"));
		}
	}
}
