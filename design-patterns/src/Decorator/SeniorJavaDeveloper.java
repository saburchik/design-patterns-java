package Decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
	public SeniorJavaDeveloper(Developer developer) {
		super(developer);
	}
	
	public String makeCodeReview() {
		return "- Make code review.";
	}

	@Override
	public String makeJob() {
		return super.makeJob() + "\n" +  makeCodeReview();
	}
}
