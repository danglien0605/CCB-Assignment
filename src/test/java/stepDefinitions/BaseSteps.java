package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import pageObjects.BasePage;

public class BaseSteps {

	TestContext testContext;
	 BasePage basePage;

	public BaseSteps(TestContext context) {
		testContext = context;
		basePage = testContext.getPageObjectManager().getHomePage();
	}


	@Given("^I went to the Sleek SG \"([^\"]*)\" page$")
	public void iWentToTheSleekSGPage(String pageName)  {
		basePage.navigateToPage(pageName);

	}
}
