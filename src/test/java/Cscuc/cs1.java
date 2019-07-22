package Cscuc;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cs1 {
	WebDriver driver;
	WebDriverWait wait;
	@Given("enter the url")
	public void enter_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\Chromedriver.exe");
		  //Create an instance for chrome driver
				 driver = new ChromeDriver();
				
		  //Navigate to URL
				driver.get("http://192.168.40.4:8083/TestMeApp");
				
		  //Maximizing the screen
				driver.manage().window().maximize();
				
		  //Provide Implicit wait
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		  //Explicit wait
			//	wait = new WebDriverWait(driver,20);
	} 
	@Then("Click on sign up")
	public void click_on_sign_up() {
		 driver.findElement(By.linkText("SignUp")).click();
			}
	
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
	
		 @Then("register with credentials")
	public void register_with_credentials(io.cucumber.datatable.DataTable dataTable) {
	   
		List<Map<String,String>> list=dataTable.asMaps(String.class,String.class);
		driver.findElement(By.id("userName")).sendKeys(list.get(0).get("Username"));
		driver.findElement(By.id("firstName")).sendKeys(list.get(0).get("Firstname"));
		driver.findElement(By.id("lastName")).sendKeys(list.get(0).get("LastName"));
		driver.findElement(By.name("password")).sendKeys(list.get(0).get("Password"));
		driver.findElement(By.name("confirmPassword")).sendKeys(list.get(0).get("ConfirmPassword"));
		driver.findElement(By.xpath(".//input[@type='radio' and @value='Female']")).click();
		driver.findElement(By.id("emailAddress")).sendKeys(list.get(0).get("Email"));
		driver.findElement(By.id("mobileNumber")).sendKeys(list.get(0).get("MobileNumber"));
		driver.findElement(By.id("")).sendKeys(list.get(0).get("DOB"));
		driver.findElement(By.id("address")).sendKeys(list.get(0).get("Address"));
		driver.findElement(By.id("securityQuestion")).click();
		driver.findElement(By.xpath(".//option[@value='411010']")).click();
		driver.findElement(By.id("answer")).sendKeys(list.get(0).get("answer"));
		driver.findElement(By.name("Submit")).click();
	}

}
