package AbstractMethod.banking;
import AbstractMethod.ProjectTeamFactory;
import AbstractMethod.Developer;
import AbstractMethod.Tester;
import AbstractMethod.ProjectManager;


public class BankingTeamFactory implements ProjectTeamFactory {
	@Override
	public Developer getDeveloper() {
		return new JavaDeveloper();
	}
	@Override
	public Tester getTester() {
		return new QATester();
	}
	@Override
	public ProjectManager getProjectManager() {
		return new BankingPM();
	}
}
