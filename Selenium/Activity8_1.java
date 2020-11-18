package Selenium_Session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Activity8_1 {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
 
        Thread.sleep(100);
        
        //Find checkbox and toggle button
        WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
        WebElement toggleCheckboxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        
        Thread.sleep(100);
        
        //Click the toggle button
        toggleCheckboxButton.click();
        
        Thread.sleep(100);
        
        //Wait for checkbox to disappear
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        
        Thread.sleep(100);
        
        //Click toggle button again
        toggleCheckboxButton.click();
        
        Thread.sleep(100);
        
        //Wait for checkbox to appear
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();
        
        Thread.sleep(100);
        
        //Close browser
        driver.close();
    }
}
