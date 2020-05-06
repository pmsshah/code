import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DPJC1_DerbyDBSingleton {
	private static volatile DPJC1_DerbyDBSingleton instance = null;
	private static volatile Connection conn = null;
	
	private DPJC1_DerbyDBSingleton () {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(conn != null) {
			throw new RuntimeException("Use getInstance() method to create the instance");		
		}
		if(instance != null) {
			throw new RuntimeException("Use getInstance() method to create the instance");		
		}
	}
	public static DPJC1_DerbyDBSingleton getInstance() {
		if(instance == null) {
			synchronized(DPJC1_DerbyDBSingleton.class) {
				if(instance == null) {
					instance = new DPJC1_DerbyDBSingleton();
				}
			}
		}
		return instance;	
	}
	public Connection getConnection() {
		if(conn == null) {
			synchronized(DPJC1_DerbyDBSingleton.class) {
				if(conn == null) {
					try {
						String dbURL = "jdbc:derby:memory:codejava/webdb;create=true";
						conn = DriverManager.getConnection(dbURL);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return conn;
	}
}
