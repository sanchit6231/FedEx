package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinationLogin {

	WebDriver driver;

	@Given("^user has launched the FedEx link$")
	public void launchFexExSite() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\git\\FedEx\\FedEx\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.fedex.com/en-gb/home.html");
		driver.manage().window().maximize();
	}

	@When("^choose location popup is available$")
	public void locationPopuo() {
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/h3")).isDisplayed();

	}

	@When("^location india is available$")
	public void locationIndiaAvailable() {
		String locIndia = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div[1]/h4")).getText();
		System.out.println("Is it India:" + locIndia);
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

	@Then("^user is on Home page$")
	public void homePage() {
		String homepg = driver.getTitle();
		System.out.println("home page : " + homepg);
		Assert.assertEquals("FedEx | Express Delivery, Courier & Shipping Services | India", homepg);
	}

	@Then("^user click on Rate & Transmit Times$")
	public void rateTransmitTimes() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"cubeOnePar\"]/button")).click();
	}

	@Then("^user enter select value from and to value$")
	public void selectToFrom() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement fromPlace = driver.findElement(By.xpath("//*[@id=\"fromGoogleAddress\"]"));
		fromPlace.click();
		fromPlace.sendKeys("Mumbai");
		Thread.sleep(3000);
		fromPlace.sendKeys(Keys.ARROW_DOWN + "" + Keys.ENTER);
		fromPlace.sendKeys(Keys.ENTER);

		WebElement toPlace = driver.findElement(By.xpath("//*[@id=\"toGoogleAddress\"]"));
		toPlace.click();
		toPlace.sendKeys("Amsterdam");
		Thread.sleep(3000);
		toPlace.sendKeys(Keys.ARROW_DOWN + "" + Keys.ARROW_DOWN + "" + Keys.ENTER);
		// driver.findElement(By.xpath("//*[@id=\"fromGoogleAddress\"]")).sendKeys("Mumbai");

		// List<WebElement> fromPlace =
		// driver.findElements(By.xpath("//*[@id=\"fromGoogleAddress\"]"));
//		System.out.println("Total Size : "+fromPlace.size());
//		fromPlace.get(1).click(); //*[@id="main-container"]/div/fdx-purple-engine/fdx-loading-indicator/div[2]/div/div/div/magr-nimps-container/magr-package-details/fieldset/div/form/div[1]/magr-liability-coverage/div/div[1]/div/div[2]/fieldset/div/div[1]/label
	}

	@Then("^user select Higher limit Yes and Packaging 10kg$")
	public void limitPackaging() {
		driver.findElement(By.xpath(
				"//*[@id=\"main-container\"]/div/fdx-purple-engine/fdx-loading-indicator/div[2]/div/div/div/magr-nimps-container/magr-package-details/fieldset/div/form/div[1]/magr-liability-coverage/div/div[1]/div/div[2]/fieldset/div/div[1]/label"))
				.click();
//		List<WebElement> packaging = driver.findElements(By.xpath("//*[@id=\"package-details__package-type\"]"));
//		System.out.println("Total Size : " + packaging.size());
//		packaging.get(1).click();

		WebElement pack = driver.findElement(By.xpath("//*[@id=\"package-details__package-type\"]"));
		Select packaging = new Select(pack);
		packaging.selectByIndex(1);
		;
	}

	@Then("^user enter weight dimention and value$")
	public void enterDimentions() {
		driver.findElement(By.xpath("//*[@id=\"package-details__weight-0\"]")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id=\"package-details__value-0\"]")).sendKeys("10000");
	}

	@Then("^user clicks on Show Rate$")
	public void showRates() {
		driver.findElement(By.xpath("//*[@id=\"e2ePackageDetailsSubmitButtonRates\"]")).click();
	}

	@Then("^user clicks on Track button$")
	public void clickTrack() {
		driver.findElement(By.xpath("//*[@id=\"cubeTwoPar\"]/button")).click();

		// *[@id="HomeTrackingApp"]/div/input[1]
	}

	@Then("^enter tracking id and click track$")
	public void trackIdTrackButton() {
		driver.findElement(By.xpath("//*[@id=\"HomeTrackingApp\"]/div/input[1]")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"btnSingleTrack\"]")).click();
	}

	@Then("^user clicks on Sign up/Log in button$")
	public void signInLogIn() {
		driver.findElement(By.xpath("//*[@id=\"fxg-dropdown-signIn\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"global-login-wrapper\"]/div/div/div[1]/div/a")).click();
	}

	@Then("^user enters user id and password and click on Log in button$")
	public void logIn() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"userId\"]")).sendKeys("abc@abc.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc@123");
		driver.findElement(By.xpath("//*[@id=\"login-btn\"]")).click();
	}

	@Then("^user click on search button$")
	public void searchButton() {
		driver.findElement(By.xpath("/html/body/div[2]/header/div/div/nav/div/div/div/div[2]/a/span/img")).click();
	}

	@Then("^user enter invlaid tracking id and click on search button$")
	public void enterTrackId() {
		driver.findElement(By.xpath("//*[@id=\"fxg-search-text\"]")).sendKeys("333333444");
		driver.findElement(By.xpath("//*[@id=\"fxg-search-icon\"]/img")).click();
	}

	@Then("^verify incorrect track id msg is populated$")
	public void msgInvalidTrackId() throws InterruptedException {
		Thread.sleep(10000);
		String invalidTrackIdMsg = driver.findElement(By.xpath(
				"//*[@id=\"container\"]/ng-component/div/trk-shared-stylesheet-wrapper[1]/div/div/div/trk-shared-system-error/div"))
				.getText();
		Assert.assertEquals(
				"No record of this tracking number can be found at this time, please check the number and try again later. For further assistance, please contact Customer Service.",
				invalidTrackIdMsg);
	}

	@Then("^user clicks on Support option and new Customer Centre$")
	public void supportOption() {
		driver.findElement(By.xpath("/html/body/div[2]/header/div/div/nav/div/ul/div[3]/li/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/header/div/div/nav/div/ul/div[3]/li/div/div[1]/div/a")).click();
	}

	@Then("^verify Before manage and after your ship option is present$")
	public void options() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[6]/div/div[1]")).isDisplayed();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[6]/div/div[2]")).isDisplayed();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[6]/div/div[3]")).isDisplayed();
	}

}
