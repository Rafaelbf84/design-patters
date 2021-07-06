package behavioral.templateMethod.impl;

public class Main {

	public static void main(String[] args) {
		DataAccessObject daoCategories = new Categories();
		daoCategories.run();

		DataAccessObject daoProducts = new Products();
		daoProducts.run();
	}

}
