package Builder;

public class BuildWebsiteRunner {

	public static void main(String[] args) {
		Director director = new Director();
		director.setBuilder(new EnterpriceWebsite());
		Website website = director.buildWebsite();
		
		System.out.println(website);
	}

}
