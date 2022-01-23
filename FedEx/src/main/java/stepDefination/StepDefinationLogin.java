package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinationLogin {
	
	WebDriver driver;

	@Given("^user has launched the FedEx link$")
	public void launchFexExSite() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\git\\FedEx\\FedEx\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.fedex.com/en-gb/home.html");
	}

	@When("^choose location popup is available$")
	public void locationPopuo() {
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/h3")).isDisplayed();

	}

	@When("^location india is available$")
	public void locationIndiaAvailable() {
		String locIndia = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div[1]/h4")).getText();
		System.out.println("Is it India:"+locIndia);
		Assert.assertEquals("India", locIndia);
	}

	@Then("^user clicks on Engligh button$")
	public void clickEnglishButton() {
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div[1]/ul/li/a")).click();

	}

	@Then("^exit browser$")
	public void exitBrowser() {
		driver.quit();
	}
	
	@Then("^user verifies notification popup$")
	public void verifyNotificationPopup() {
		
		driver.findElement(By.xpath("//*[@id=\"bbiModalBody\"]/div/p[1]")).isDisplayed();
	}
	
	@Then("^user closes the notification popup$")
	public void closePopup() {
		driver.findElement(By.xpath("//*[@id=\"fedexmodal\"]/div/div/div[1]/button/a")).click();
	}
	
	
}
