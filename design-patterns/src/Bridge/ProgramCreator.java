package Bridge;

public class ProgramCreator {

	public static void main(String[] args) {
		Program [] programs = {
				new BankSystem(new JavaDeveloper()),
				new StockExchange(new TypeScriptDeveloper())
		};
		
		for(Program program: programs) {
			program.developProgram();
		}
	}

}
