
public class DPJC3_Builder_Pattern_Eg1 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("This is an example");
		builder.append("Playing with string builder");
		builder.append("add some numbers ");
		builder.append(10);
		System.out.println(builder.toString());

	}

}
