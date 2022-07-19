package Builder;

public class Website {
	private String name;
	private Cms CMS;
	private int price;

	public void setName(String name) {
		this.name = name;
	}
	public void setCMS(Cms CMS) {
		this.CMS = CMS;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Website {" +
				"name: '" + name + '\'' +
				", cms: '" + CMS + '\'' +
				", price: " + price +
				"}";
	}
}
