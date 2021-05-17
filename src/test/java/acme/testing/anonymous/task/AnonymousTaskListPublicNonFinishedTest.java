package acme.testing.anonymous.task;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import acme.testing.AcmePlannerTest;


public class AnonymousTaskListPublicNonFinishedTest extends AcmePlannerTest {

		// Lifecycle management ---------------------------------------------------

		// Test cases -------------------------------------------------------------
		
		@ParameterizedTest
		@CsvFileSource(resources = "/anonymous/task/list-public-non-finished.csv", encoding = "utf-8", numLinesToSkip = 1)
		@Order(10)
		public void listPublicNonFinished(final int recordIndex, final String visibility, final String title, final String executionStart, final String executionEnd, final String description, final String link, final String workload) {

			super.clickOnMenu("Anonymous", "Open tasks");
			
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

			
		}
		
		// Ancillary methods ------------------------------------------------------

}
