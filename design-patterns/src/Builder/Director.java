package Builder;

public class Director {
	WebsiteBuilder builder;
	
	public void setBuilder(WebsiteBuilder builder) {
		this.builder = builder;
	}
	
	Website buildWebsite() {
		builder.createWebsite();
		builder.buildName();
		builder.buildCMS();
		builder.buildPrice();
		
		Website website = builder.getWebsite();
		return website;
	}
}
