package creational.factoryMethod.impl;

public class Main {

	public static void main(String[] args) {
		Document resume = new Resume();
		Document report = new Report();
		
		System.out.println(resume.getClass().getSimpleName());
		for (Page page : resume.getPages()) {
			System.out.println(page.getClass().getSimpleName());
		}
		System.out.println();

		System.out.println(report.getClass().getSimpleName());
		for (Page page : report.getPages()) {
			System.out.println(page.getClass().getSimpleName());
		}
		System.out.println();
	}
	
}
