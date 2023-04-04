package test_NG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart_signin {
	ChromeDriver driver;
@BeforeMethod
public void lunchbrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.flipkart.com/");
}
@Test
public void signin() {
	driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7846922328");
	driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
}
@AfterMethod
public void closebrowser() {
	driver.quit();
}


}
