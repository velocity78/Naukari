package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Pages.UpdateCV;
import Pages.UpdatePage;

public class BaseTest {

	public static WebDriver driver;
	public UpdatePage resume;
	public UpdateCV cv;

	@BeforeSuite
	public void initBrowser() throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(5000);
	}

	@AfterSuite
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

	@BeforeClass
	public void creatObject() {
		resume = new UpdatePage(driver);
		cv = new UpdateCV(driver);
	}
}
