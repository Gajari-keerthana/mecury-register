package pageObjects;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class RegisterDetails {
	
public WebDriver ldriver;
	
	
	public RegisterDetails(WebDriver rdriver)   //constructor
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
   By lnkREGISTER= By.xpath("//a[@href = 'register.php']");
  
	
//	WebElement country=ldriver.findElement(By.name("country"));
//
//	
//	public static void selectOptionFromDropDown(WebElement ele, String value)
//	{
//		Select drp = new Select(ele);
//		
//		List<WebElement>alloptions=drp.getOptions();
//		
//		for(WebElement option:alloptions)
//		{
//			if(option.getText().equals("Cuba"))
//			{
//				option.click();
//				break;
//			}
//		}
//	}
	
	
	
	
	By txtFirstName = By.xpath("//input[@name='firstName']");
	By txtLastName = By.xpath("//input[@name='lastName']");
	
	By txtphone = By.xpath("//input[@name='phone']");
	
	By txtEmail = By.xpath("//input[@id='userName']");
	
	By txtAddress = By.xpath("//input[@name= 'address1']");
	
	By txtCity = By.xpath("//input[@name= 'city']");
	
	By txtState = By.xpath("//input[@name= 'state']");
	
	By txtpostalcode = By.xpath("//input[@name = 'postalCode']");
	
	
	
	
//	By txtcountry = By.xpath("//name[@name='country'");
//	
//	By lstitemINDIA = By.xpath("//li[contains(text(),'INDIA')]");
	
	By drpmgOfcountry= By.xpath("//*[@name='country']");
	
	By txtusername = By.xpath("//input[@name = 'email']");
	
	By txtpassword = By.xpath("//input[@name = 'password']");
	
	By txtconfirmpassword = By.xpath("//input[@name = 'confirmPassword']");
	
	//By btnsubmitquery = By.xpath("//button[@name='submit']");
	By btnsubmitquery = By.name("submit");
	
	//Actions methods
	
	
	
	public void clickOnREGISTER()
	{
		ldriver.findElement(lnkREGISTER).click();
	}
	
	public String getPageTitle()
	{
		return ldriver.getTitle();
	}
	
	
	public void setFirstName(String fristname)
	{
		ldriver.findElement(txtFirstName).sendKeys(fristname);
	}
	
	public void setLastName(String lastName)
	{
		ldriver.findElement(txtLastName).sendKeys(lastName);
	}
	
	public void setphone(String phone)
	{
		ldriver.findElement(txtphone).sendKeys(phone);
	}
	
	public void setEmail(String userName)
	{
		ldriver.findElement(txtEmail).sendKeys(userName);
	}
	
	public void setAddress(String address1)
	{
		ldriver.findElement(txtAddress).sendKeys(address1);
	}
	
	public void setCity(String city)
	{
		ldriver.findElement(txtCity).sendKeys(city);
	}
	
	public void setState(String state)
	{
		ldriver.findElement(txtState).sendKeys(state);
	}
	
	public void setpostalcode(String postalCode)
	{
		ldriver.findElement(txtpostalcode).sendKeys(postalCode);
	}
	
	public void setcountry(String value)
	{
		Select drp = new Select(ldriver.findElement(drpmgOfcountry));
		drp.selectByVisibleText(value);
	}
	
	public void setusername(String email)
	{
		ldriver.findElement(txtusername).sendKeys(email);
	}
	
	public void setpassword(String password)
	{
		ldriver.findElement(txtpassword).sendKeys(password);
	}
	
	public void setconfirmpassword(String confirmPassword)
	{
		ldriver.findElement(txtconfirmpassword).sendKeys(confirmPassword);
	}
	
	public void clickOn()
	{
		ldriver.findElement(btnsubmitquery).click();
	}
	
	
	
	

	
	

}




