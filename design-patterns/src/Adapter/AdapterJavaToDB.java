package Adapter;

public class AdapterJavaToDB extends JavaApp implements DataBase {
	@Override
	public void insert() {
		saveObj();
	}
	@Override
	public void update() {
		updateObj();
	}
	@Override
	public void select() {
		loadObj();
	}
	@Override
	public void remove() {
		deleteObj();
	}

}
