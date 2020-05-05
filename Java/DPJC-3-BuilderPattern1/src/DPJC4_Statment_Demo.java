import java.util.ArrayList;
import java.util.List;

public class DPJC4_Statment_Demo {

	public static void main(String[] args) {
		String sql = "select * from movies where title = ?";
		List<String> parameters = new ArrayList<>();
		parameters.add("Star wars");
		DPJC4_Record record = new DPJC4_Record();
		
		DPJC4_Statment firstStatment = new DPJC4_Statment(sql, parameters, record);
		System.out.println(firstStatment.getSql());
		System.out.println(firstStatment.getParameters());
		System.out.println(firstStatment.getRecord());
		
		DPJC4_Statment firstStatment2 = firstStatment.clone();
		System.out.println(firstStatment2.getSql());
		System.out.println(firstStatment2.getParameters());
		System.out.println(firstStatment2.getRecord());
	}

}
