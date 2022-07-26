package Adapter;

public class RunnerDB {

	public static void main(String[] args) {
		DataBase dataBase = new AdapterJavaToDB();
		
		dataBase.insert();
		dataBase.update();
		dataBase.select();
		dataBase.remove();
	}

}
