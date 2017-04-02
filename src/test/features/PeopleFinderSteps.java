package test.features;

import com.smartbear.ready.cmd.runner.pro.SoapUIProTestCaseRunner;

//import com.smartbear.ready.cmd.runner.pro.SoapUIProTestCaseRunner;

//import com.eviware.soapui.SoapUIProTestCaseRunner;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PeopleFinderSteps {

	private SoapUIProTestCaseRunner soapUI;

	@Given("^I am searching for someone$")
	public void i_am_searching_for_someone() throws Throwable {
		soapUI = new SoapUIProTestCaseRunner();
		soapUI.setProjectFile("src/Soap and Cucumber.xml");
		soapUI.setTestSuite("http://localhost:8080 TestSuite");
		soapUI.setTestCase("People Service TestCase");
	}

	@When("^supplying a location$")
	public void supplying_a_location() throws Throwable {

	}

	@Then("^see \"([^\"]*)\" is there\\.$")
	public void see_is_there(String name) throws Throwable {
		String fullName[] = name.split(" ");
		String firstName = fullName[0];
		String lastName = fullName[1];
		String [] properties = {"lastName="+lastName, "firstName="+ firstName};
		
		soapUI.setProjectProperties(properties);
		soapUI.run();
	}
}
