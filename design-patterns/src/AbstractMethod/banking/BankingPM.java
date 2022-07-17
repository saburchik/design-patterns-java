package AbstractMethod.banking;
import AbstractMethod.ProjectManager;

public class BankingPM implements ProjectManager {
	@Override
	public void managerProject() {
		System.out.println("Banking PM manages banking project...");
	}
}
