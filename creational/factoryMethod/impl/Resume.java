package creational.factoryMethod.impl;

public class Resume extends Document {

	@Override
	public void createPages() {
		getPages().add(new SkillsPage());
		getPages().add(new EducationPage());
		getPages().add(new ExperiencePage());
	}

}
