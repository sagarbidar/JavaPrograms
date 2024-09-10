package sagar.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
	this.driver=driver;
	//to initialize the driver life to @findby
	PageFactory.initElements(driver, this);
	}
	
	WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	   //driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("hello");
	  // driver.findElement(By.linkText("Forgot your password?")).click();
	   
	   ///pagefactory
	   @FindBy(xpath="//input[@placeholder='Username']")
	   WebElement username2;
}
