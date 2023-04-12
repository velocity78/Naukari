package TestClass;

import java.time.Duration;

import org.testng.annotations.Test;

public class CvTest extends BaseTest {

	@Test

	public void uploadCV() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        cv.upload();
	}
}