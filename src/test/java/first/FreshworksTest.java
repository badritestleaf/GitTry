package first;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FreshworksTest 
{
	
	WebDriver driver = null;
	
	@Test
	public void login() throws Exception
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafing.myfreshworks.com");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//input[@data-testid='username']"));
		Assert.assertTrue(element.isDisplayed());
		driver.quit();
	}
}
