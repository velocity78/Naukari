package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UpdatePage {

	private WebDriver driver;
	
	private By username= By.xpath("//*[@id='usernameField']");
	private By password=By.xpath("//*[@id='passwordField']");
	private By button=By.xpath("(//*[@type='submit'])[1]");
	private By viewProfile=By.xpath("//*[@class='view-profile-wrapper']");
	
	
	public UpdatePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Login() 
	{
		driver.findElement(username).sendKeys("User_Name");
		driver.findElement(password).sendKeys("Password");
		driver.findElement(button).click();
	}
	
	public void viewprofile() 
	{
		driver.findElement(viewProfile).click();
	}
	
}
