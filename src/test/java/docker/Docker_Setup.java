package docker;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Docker_Setup {

	
	@BeforeTest
	public void start_Docker() throws Exception
	{
		Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
		Thread.sleep(25000);
	}
	
	@AfterTest
	public void stop_Docker() throws Exception
	{
		Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
		Thread.sleep(10000);
		
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}
}
