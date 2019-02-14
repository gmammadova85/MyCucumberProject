package util;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {
	private static WebDriver driver;
	
	@Before
	public void setDriver(){
		System.setProperty(Configs.getProperty("chromeDriver"), Configs.getProperty("chromePath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Base.driver = driver;
	}
	@After
	public void tearDown(){
		driver.quit();
	}

}
