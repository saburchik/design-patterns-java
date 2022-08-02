package Composite;

public class Project {

	public static void main(String[] args) {
		Team team = new Team();
		
		Developer firstJavaDev = new JavaDeveloper();
		Developer secondJavaDev = new JavaDeveloper();
		Developer cppDev = new CppDeveloper();
		
		team.addDeveloper(firstJavaDev);
		team.addDeveloper(secondJavaDev);
		team.addDeveloper(cppDev);
		
		team.createProject();
	}

}
