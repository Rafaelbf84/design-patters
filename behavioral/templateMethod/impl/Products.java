package behavioral.templateMethod.impl;


public class Products extends DataAccessObject{

	@Override
	public void select() {
		System.out.println("Selecting products from DB");
		result = "1, 2, 3";
	}

	@Override
	public void process() {
		System.out.print("Products: ");
		System.out.println(result);
	}

}
