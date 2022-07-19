package Builder;

public class EnterpriceWebsite extends WebsiteBuilder {
	@Override
	void buildName() {
		website.setName("Enterprice web site");
	}
	@Override
	void buildCMS() {
		website.setCMS(Cms.BITRIX);
	}
	@Override
	void buildPrice() {
		website.setPrice(700);
	}
}
