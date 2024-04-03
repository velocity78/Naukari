package TestClass;

import java.time.Duration;

import org.testng.annotations.Test;

public class UpdateTest extends BaseTest {

	
	@Test
	public void login() 
	{
		resume.Login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test
	public void view() 
	{
		resume.viewprofile();
		
	}
		
}
