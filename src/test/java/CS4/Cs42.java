package CS4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Cs42 {
	WebDriver driver;
	WebDriverWait wait;
@Given("User registered into TestMeApp")
public void user_registered_into_TestMeApp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

	//Create an instance for chrome driver
			 driver = new ChromeDriver();
			
	//Navigate to URL
			driver.get("http://192.168.40.4:8083/TestMeApp1");
			
	//Maximizing the screen
			driver.manage().window().maximize();
			
	//Provide Implicit wait
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	//Explicit wait
			wait = new WebDriverWait(driver,20);

			driver.findElement(By.linkText("SignIn")).click();
			driver.findElement(By.id("userName")).sendKeys("Lalitha");
			driver.findElement(By.id("password")).sendKeys("Password123");
			driver.findElement(By.name("Login")).click();

    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@When("user search for HeadPhones")
public void user_search_for_HeadPhones() {
    // Write code here that turns the phrase above into concrete actions
   //throw new cucumber.api.PendingException();
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//span[contains(text(),'All')]"))));
	WebElement all_cat = driver.findElement(By.xpath(".//span[contains(text(),'All')]"));
	all_cat.click();
	//Thread.sleep(3000);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//span[contains(text(),'Electronics')]"))));
	WebElement Electronics = driver.findElement(By.xpath(".//span[contains(text(),'Electronics')]"));
	Electronics.click();
	//Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//span[contains(text(),'Head Phone')]"))));
	WebElement Head_Phone = driver.findElement(By.xpath(".//span[contains(text(),'Head Phone')]"));
	Head_Phone.click();
	//Thread.sleep(3000);
	driver.findElement(By.xpath(".//a[@class='btn btn-success btn-product']")).click();
	driver.findElement(By.xpath(".//a[@href='displayCart.htm']")).click();	
}

@When("Proceeds to payment without adding items")
public void proceeds_to_payment_without_adding_items() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath(".//a[@class='btn btn-success btn-product']")).click();
	driver.findElement(By.xpath(".//a[@href='displayCart.htm']")).click();	
	
}

@Then("TestMeApp doesnt the cart icon")
public void testmeapp_doesnt_the_cart_icon() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	if(driver.getCurrentUrl().equalsIgnoreCase("http://192.168.40.4:8083/TestMeApp1/displaycart.htm"))
	{
		System.out.println("fail");
	}
	else {
		System.out.println("pass");
	}
	driver.close();
}

}
