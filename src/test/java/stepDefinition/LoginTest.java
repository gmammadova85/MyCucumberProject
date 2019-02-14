package stepDefinition;

import org.junit.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagePackages.LoginPage;
import util.Base;

public class LoginTest  extends Base{
	LoginPage loginPage = new LoginPage();
	
	@ Test
	
	 @Given("^User in Homepage$")
	    public void user_in_homepage() throws Throwable {
		 String url = "https://www.facebook.com/";
		 driver.get(url);
		
	    }

	    @When("^User enter Username and Password$")
	    public void user_enter_username_and_password() throws Throwable {
	    	loginPage.userName.sendKeys("test@gmail.com");
	    	loginPage.passWord.sendKeys("21321aze");
	    	loginPage.logInBtn.click();
	    	
	    }

	    @Then("^User launched User Page$")
	    public void user_launched_user_page() throws Throwable {
	    	System.out.println("User is on User page.");
	    }

}
