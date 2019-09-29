package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Docker_FF {

	
	
	@Test
	public void ff() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName(BrowserType.FIREFOX);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://www.youtube.com");
		driver.manage().window().maximize();
		//driver.findElement(By.name("q")).sendKeys("qtp",Keys.ENTER);
		System.out.println(driver.getTitle());
	//	driver.quit();
	}
	
	
}
