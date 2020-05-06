
public class DPJC3_LunchOrder_Demo {

	public static void main(String[] args) {
		DPJC3_LunchOrder.Builder builder = new DPJC3_LunchOrder.Builder();
		builder.bread("wheat").dressing("Mayo").meat("Turkey");
		DPJC3_LunchOrder lunchorder = builder.build();
		System.out.println(lunchorder.getBread());
		System.out.println(lunchorder.getCondiments());
		System.out.println(lunchorder.getDressing());
		System.out.println(lunchorder.getMeat());
	}
}
