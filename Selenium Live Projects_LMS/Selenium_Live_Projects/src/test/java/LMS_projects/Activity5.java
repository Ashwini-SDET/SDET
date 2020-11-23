package LMS_projects;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
	public WebDriver driver;
	 
	 @BeforeMethod
	  public void OpenURL() {
	  driver= new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/lms"); 
}
  @Test
  public void Anotherpage() {
	  driver.findElement(By.linkText("My Account")).click();
	  String ActualTitle = driver.getTitle();
	  String ExpectedTitle = "My Account – Alchemy LMS";
	  
	  if (ActualTitle.equals(ExpectedTitle)) {
		  
	  System.out.println("You have successfully navigated to My Account Page");
	  
	  }
	  else {
		  
		  System.out.println ("The Title of the Page does not match");  
	  } 
  }
  

  @AfterMethod
  public void afterMethod() {
	//Close the browser
      driver.quit();
  
  }

}
