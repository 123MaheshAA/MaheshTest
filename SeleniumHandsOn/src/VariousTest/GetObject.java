package VariousTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GetObject {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Eclipse\\Selenium JAR\\IE & Chrome Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com");
		WebElement aa= driver.findElement(By.xpath(".//input[@title='search']"));
		aa.sendKeys("Mahesh");
		
		
		//driver.close();
		
	}

}
