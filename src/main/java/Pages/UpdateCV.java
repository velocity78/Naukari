package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UpdateCV {

	private WebDriver driver;
	
	private By update= By.xpath("//*[@id='attachCV']");
	
	
	public UpdateCV(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void upload() 
	{
		driver.findElement(update).sendKeys("C:\\Users\\Nikhil\\Desktop\\Nikhil_Salunkhe.pdf");
	
	}
}
