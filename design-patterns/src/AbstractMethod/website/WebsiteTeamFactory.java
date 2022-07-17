package AbstractMethod.website;
import AbstractMethod.ProjectTeamFactory;
import AbstractMethod.Developer;
import AbstractMethod.Tester;
import AbstractMethod.ProjectManager;


public class WebsiteTeamFactory implements ProjectTeamFactory {
	@Override
	public Developer getDeveloper() {
		return new PhpDeveloper();
	}
	@Override
	public Tester getTester() {
		return new ManualTester();
	}
	@Override
	public ProjectManager getProjectManager() {
		return new WebsitePM();
	}
}