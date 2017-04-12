package test.features.presence;

import com.smartbear.ready.cmd.runner.pro.SoapUIProTestCaseRunner;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MeetingRoomPresenceSteps {
	private SoapUIProTestCaseRunner soapUI;
	
	@Given("^\"([^\"]*)\" is in meeting room \"([^\"]*)\"$")
	public void is_in_meeting_room(String fullName, String meetingRoom) throws Throwable {
		soapUI = new SoapUIProTestCaseRunner();
		soapUI.setProjectFile("src/test/features/presence/Meeting Room Presence.xml");
		soapUI.setTestSuite("http://localhost:8080 TestSuite");
		soapUI.setTestCase("http://localhost:8080 TestCase");
		// The below was left as reference.  Delete it before checking in.
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^listing everyone in \"([^\"]*)\"$")
	public void listing_everyone_in(String meetingRoom) throws Throwable {
		// Save doing after getting first BDD + SoapUI test working.
	}

	@Then("^\"([^\"]*)\" is listed\\.$")
	public void is_listed(String fullName) throws Throwable {
		String nameParts[] = fullName.split(" ");
		String firstName = nameParts[0];
		String lastName = nameParts[1];
		String [] properties = {"lastName="+lastName, "firstName="+ firstName};
		
		soapUI.setProjectProperties(properties);
		soapUI.run();
	}

	// Focus on making scenarios pass one at a time. So for now, leave the below pending,
	// or even delete the below code as it's more code than necessary.
	@Then("^\"([^\"]*)\" is not listed\\.$")
	public void is_not_listed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^message \"([^\"]*)\"$")
	public void message(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
