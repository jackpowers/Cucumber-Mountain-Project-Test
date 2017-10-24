package Annotation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import cucumber.annotation.en.And;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author admin
 */
public class Annotation1 {
    WebDriver driver = null; 
   @Given("^I am on the MountainProject homepage$") 
	
   public void goToMountainProject() { 
      driver = new ChromeDriver(); 
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.navigate().to("https://www.mountainproject.com/"); 
   }
	
   @When("^I search for \"(.*)\"$") 
   public void search(String arg1) {   
      
      driver.findElement(By.xpath("//input[@id='desktop-search-trigger']")).sendKeys(arg1);
      
      driver.findElement(By.xpath("//img[@id='search-icon']")).click();
   }
   
   @And("^I click on the Nose link in the search results$")
   public void clickLink(){
       
       WebDriverWait wait = new WebDriverWait(driver, 20);
       
       WebElement button = driver.findElement(By.xpath("//button[contains(.,'Search ')]"));
       
       wait.until(ExpectedConditions.elementToBeClickable(button));
      
       driver.findElement(By.linkText("The Nose")).click();
       
       
   }
  
	
   @Then("^I am taken to the Nose page$") 
   public void checkLocation() {  
       
       
      WebDriverWait wait = new WebDriverWait(driver, 20);
      
      
      WebElement button2 = driver.findElement(By.xpath("//img[@id='search-icon']"));
      
      wait.until(ExpectedConditions.elementToBeClickable(button2));
      
      if (driver.getCurrentUrl().equalsIgnoreCase("https://www.mountainproject.com/v/"
              + "105924807?search=1&type=route&method=resultsPage&query=the%20nose%20el%20capitan")){
          System.out.println("Test Passed");
      }
      else{
          System.out.println("Test Failed");
      }
      
      driver.close(); 
      driver.quit();
   }
   
	
   
}
