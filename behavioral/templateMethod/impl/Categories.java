package behavioral.templateMethod.impl;


public class Categories extends DataAccessObject{

	@Override
	public void select() {
		System.out.println("Selecting categories from DB");
		result = "A, B, C";
	}

	@Override
	public void process() {
		System.out.print("Categories: ");
		System.out.println(result);
	}

}
