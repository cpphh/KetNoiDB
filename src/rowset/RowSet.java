package rowset;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSet {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//Thuan tien select, them sua xoa
		
		Class.forName("com.mysql.jdbc.Driver");
		JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
		
		jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/mydb");
		jdbcRowSet.setUsername("root");
		jdbcRowSet.setPassword("");
		
		String sql = "select * from demo";
		jdbcRowSet.setCommand(sql);
		jdbcRowSet.execute();
		
		while(jdbcRowSet.next()) {
			System.out.println(jdbcRowSet.getInt("id") + jdbcRowSet.getString("name"));
		}

	}

}
