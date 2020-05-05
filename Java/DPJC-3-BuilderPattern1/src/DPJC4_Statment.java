import java.util.List;

public class DPJC4_Statment implements Cloneable {
	private String sql;
	private List<String> parameters;
	private DPJC4_Record record;
	
	public DPJC4_Statment(String sql, List<String> parameters, DPJC4_Record record) {
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}
	
	public DPJC4_Statment clone() {
		try {
			return (DPJC4_Statment) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<String> getParameters() {
		return parameters;
	}
	
	public DPJC4_Record getRecord( ) {
		return record;
	}
	
	public String getSql() {
		return sql;
	}
}
