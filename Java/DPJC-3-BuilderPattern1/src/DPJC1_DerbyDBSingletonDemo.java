import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DPJC1_DerbyDBSingletonDemo {

	public static void main(String[] args) {
		DPJC1_DerbyDBSingleton instance = DPJC1_DerbyDBSingleton.getInstance();
		long timeBefore = 0;
		long timeAfter = 0;
		System.out.println(instance);
		
		timeBefore = System.currentTimeMillis();
		Connection conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();
		
		System.out.println(timeAfter - timeBefore);
		
		Statement st;
		try {
			st = conn.createStatement();
			int count = st.executeUpdate("CREATE TABLE Address ("
					+ "ID INT,"
					+ "StreetName VARCHAR(20),"
					+ "City VARCHAR(20))");
			System.out.println("Table created" + count);
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		timeBefore = System.currentTimeMillis();
		conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();
		
		System.out.println(timeAfter - timeBefore);
		System.out.println(conn);

		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from Address");
			System.out.println(rs);
			rs.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
