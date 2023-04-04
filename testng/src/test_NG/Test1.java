package test_NG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
@BeforeMethod
public void openbrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1:5000/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
@Test(invocationCount=3)
public void findhomelink() {
	WebElement el=driver.findElement(By.xpath("//a[text()='Contact']"));
	el.click();
}
@AfterMethod
public void closeapplication() {
	driver.quit();
	
}

}
