package acme.testing.anonymous.shout;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import acme.testing.AcmePlannerTest;

public class AnonymousShoutListTest extends AcmePlannerTest{

	@ParameterizedTest
	@CsvFileSource(resources = "/anonymous/shout/positive-list.csv", encoding = "utf-8", numLinesToSkip = 1)
	@Order(20)
	public void list(final int recordIndex, final String moment, final String author, final String text, final String info) {
		
	super.clickOnMenu("Anonymous","List recents shouts");
	
	super.checkColumnHasValue(recordIndex, 0, moment);
	super.checkColumnHasValue(recordIndex, 1, author);
	super.checkColumnHasValue(recordIndex, 2, text);
		
	}
}
