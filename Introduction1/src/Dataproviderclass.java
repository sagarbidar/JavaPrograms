import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderclass {
		
	@DataProvider(name = "data-set")
	    public static Object[][] DataSet(){
	        
	        Object[][] obj = {
	                {"standard_user", "1444"},
	                {"standard_user123", "123"}
	                };
	        return obj;
	    } 
		
		
		@Test(dataProvider = "data-set")
	    public void DataProvSampleTest(String username, String password) throws InterruptedException {
	        
	        System.out.println(username + " " + password);
	        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

	     // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

	        driver.get("https://rahulshettyacademy.com/locatorspractice/");

	        driver.findElement(By.id("inputUsername")).sendKeys(username);
	        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	        
	        driver.findElement(By.cssSelector("button[type='submit']")).click();
	        Thread.sleep(2000);
	        System.out.println(driver.findElement(By.cssSelector(".error")).getText());
	        
	       
	        driver.quit();
		}
	}