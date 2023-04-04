package test_NG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class All_links {
	WebDriver driver;
@BeforeMethod	
public void lunchbrowser() {
		driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5000/home");
	}
@Test
public void printalllinks(){
	driver.findElement(By.xpath("(//a[@class='nav-link  text-dark'])[2]")).click();
	List<WebElement> alllinks=driver.findElements(By.tagName("a"));
	int count=alllinks.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String text=alllinks.get(i).getText();
	System.out.println(text);
}
}
}


