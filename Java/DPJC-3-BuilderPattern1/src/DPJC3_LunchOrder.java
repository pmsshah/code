
public class DPJC3_LunchOrder {
	public static class Builder {
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;
		
		public DPJC3_LunchOrder build() {
			return new DPJC3_LunchOrder(this);
		}
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}

		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}


		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}		
		
	}
	private final String bread;
	private final String condiments;
	private final String dressing;
	private final String meat;
	
	private DPJC3_LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.dressing = builder.dressing;
		this.meat = builder.meat;
	}
	
	public String getBread() {
		return bread;
	}
	public String getCondiments() {
		return condiments;
	}
	public String getDressing() {
		return dressing;
	}
	public String getMeat() {
		return meat;
	}

	
}
