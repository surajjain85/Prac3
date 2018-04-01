package leraningjava;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Comparison {
WebDriver driver;

@Before
public void openb(){
	System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium Files\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.navigate().to("https://paytm.com/");
}

@Test
public void testing(){
	driver.findElement(By.id("164")).sendKeys("00000000");
}

}
