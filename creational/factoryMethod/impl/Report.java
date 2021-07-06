package creational.factoryMethod.impl;

public class Report extends Document {

	@Override
	public void createPages() {
		getPages().add(new IntroductionPage());
		getPages().add(new ResultsPage());
		getPages().add(new ConclusionPage());
		getPages().add(new SummaryPage());
		getPages().add(new BibliographyPage());
	}

}
