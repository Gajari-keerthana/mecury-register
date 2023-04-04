package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import pageObjects.RegisterDetails;

public class RegisterStep {
	
	public static WebDriver driver;
	public RegisterDetails rp;
	public RegisterDetails adddetails;
	
	
	
	
	public static String randomstring()
	{
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return(generatedString1);
	}
	
	
	@Given("User launch mozila firefox browser")
	public void user_launch_mozila_firefox_browser() {
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+".//Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		rp=new RegisterDetails(driver);
	  
	}
	

	
	@When("User opens URL {string}")
	public void user_opens_url( String url) {
		driver.get(url);
	
		adddetails = new RegisterDetails(driver);
		
		//Assert.assertEquals("Register: Mercury Tours", adddetails.getPageTitle());
		Assert.assertEquals("Welcome: Mercury Tours", adddetails.getPageTitle());
		
	    
	}

	@When("click on REGISTER")
	public void click_on_REGISTER() throws InterruptedException { 
		Thread.sleep(3000);
		adddetails.clickOnREGISTER();
		
	    
	}
	
	@When("page Title should be {string}")
	public void page_title_should_be(String string) {
		//Assert.assertEquals("Register: Mercury Tours", adddetails.getPageTitle());
		if(driver.getPageSource().contains("Login was unsuccessful.")) 
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else {
			
			Assert.assertEquals(string,driver.getTitle());
		}
		
	   
	}

	@Then("User can view Register page")
	public void user_can_view_register_page() {
		Assert.assertEquals("Register: Mercury Tours", adddetails.getPageTitle());
		
	   
	}

	@When("User enters user info")
	public void user_enters_user_info() {
		String email = randomstring()+"@gmail.com";
		adddetails.setFirstName("raghu");
		adddetails.setLastName("manu");
		adddetails.setphone("9873451262");
		adddetails.setEmail("raghu@gmail.com");
		adddetails.setAddress("manikonds");
		adddetails.setCity("jagir"); 
		adddetails.setState("Telangana");
		adddetails.setpostalcode("500032");
		adddetails.setcountry("INDIA");
		adddetails.setusername(email);
		adddetails.setpassword("manu123");
		adddetails.setconfirmpassword("manu123");
		
	  
	}

	@When("click on Submit Query button")
	public void click_on_submit_query_button() throws InterruptedException {
		adddetails.clickOn();
		Thread.sleep(2000);
	   
	}

	@Then("User can see successful registration page with {string}")
	public void user_can_see_successful_registration_page_with(String msg) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Thank you for registering. You may now sign-in using the user name and password you've just entered."));
	    
	}
	
	
	
	
	@Then("close the browser")
	public void close_the_browser() {
	   driver.close();
	}

}
