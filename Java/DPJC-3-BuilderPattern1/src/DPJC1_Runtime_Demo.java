
public class DPJC1_Runtime_Demo {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		rt.gc();
		System.out.println(rt);
		Runtime rt2 = Runtime.getRuntime();
		System.out.println(rt2);
		if (rt == rt2) {
			System.out.println("Both are same");
		}
		else {
			System.out.println("Both are not same");			
		}
	}

}
