package ketnoi;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectMysql {
	
	public static Connection getConnect(){
		final String url = "jdbc:mysql://localhost:3306/mydb";
		final String user = "root";
		final String password = "";
		try {
		//Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(url, user, password);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = getConnect();
		if(conn!=null)
			System.out.println("thanh cong");

	}

}
