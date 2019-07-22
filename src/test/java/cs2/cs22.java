package cs2;


	

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;

	@SuppressWarnings("deprecation")
	public class cs22 {
	WebDriver driver;
	WebDriverWait wait;
	@Given("Click on the URL")
	public void click_on_the_URL() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://192.168.40.4:8083/TestMeApp");	
			
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		  
		 wait = new WebDriverWait(driver,30);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}


	@Given("Click on the SignIN button")
	public void click_on_the_SignIN_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("I enter the Credentials {string},{string}")
	public void i_enter_the_Credentials(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys(string);

		  driver.findElement(By.id("password")).sendKeys(string2);
	}

	@When("Click on login")
	public void click_on_login() {

		  driver.findElement(By.name("Login")).click();
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
	}
	}


