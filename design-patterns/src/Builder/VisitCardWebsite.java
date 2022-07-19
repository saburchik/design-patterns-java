package Builder;

public class VisitCardWebsite extends WebsiteBuilder {
	@Override
	void buildName() {
		website.setName("Visit cards");
	}
	@Override
	void buildCMS() {
		website.setCMS(Cms.WORDPRESS);
	}
	@Override
	void buildPrice() {
		website.setPrice(9900);
	}
}
