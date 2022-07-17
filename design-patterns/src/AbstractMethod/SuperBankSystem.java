package AbstractMethod;
import AbstractMethod.banking.BankingTeamFactory;

public class SuperBankSystem {
	public static void main(String[] args) {
		ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
		Developer developer = projectTeamFactory.getDeveloper();
		Tester tester = projectTeamFactory.getTester();
		ProjectManager projectManager = projectTeamFactory.getProjectManager();
		
		System.out.println("Creating bank system...");
		developer.writeCode();
		tester.testCode();
		projectManager.managerProject();
	}
}
