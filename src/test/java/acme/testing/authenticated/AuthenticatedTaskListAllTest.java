package acme.testing.authenticated;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import acme.testing.AcmePlannerTest;

public class AuthenticatedTaskListAllTest extends AcmePlannerTest {
	
	//Authenticated list all the finished tasks
	@ParameterizedTest
	@CsvFileSource(resources = "/authenticated/task/list-all.csv", encoding = "utf-8", numLinesToSkip = 1)
	@Order(20)
	public void listAll(final int recordIndex, final String visibility, final String title, final String executionStart, final String executionEnd, final String description, final String link, final String workload) {		
		super.signIn("authenticated1", "authenticated1");

		super.clickOnMenu("Authenticated", "Finished tasks");
		
		super.checkColumnHasValue(recordIndex, 0, visibility);
		super.checkColumnHasValue(recordIndex, 1, title);
		super.checkColumnHasValue(recordIndex, 2, executionStart);
		super.checkColumnHasValue(recordIndex, 3, executionEnd);
		super.checkColumnHasValue(recordIndex, 4, workload);
		
		super.clickOnListingRecord(recordIndex);
		
		super.checkInputBoxHasValue("visibility", visibility);
		super.checkInputBoxHasValue("title", title);
		super.checkInputBoxHasValue("executionStart", executionStart);
		super.checkInputBoxHasValue("executionEnd", executionEnd);
		super.checkInputBoxHasValue("description", description);
		super.checkInputBoxHasValue("link", link);
		super.checkInputBoxHasValue("workload", workload);

		super.signOut();
	}

}
