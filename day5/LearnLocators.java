package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	public static void main(String[] args) {
		
          ChromeDriver driver = new ChromeDriver();
          driver.get ("http://leaftaps.com/opentaps/control/main");
		  driver.manage().window().maximize();
		  
		  //Find Element and Enter the username
		  driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		  
		  //Find Element and Enter the password
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		  
		  //Find Element and click login button
		  driver.findElement(By.className("decorativeSubmit")).click();
		  
		  //Click on the CRM/SFA link
		  driver.findElement(By.linkText("CRM/SFA")).click();                   //linkText Locator
		 // driver.findElement(By.partialLinkText("CRM")).click();             //partialLinkText Locator
		  
		  //Click on the leads
		  driver.findElement(By.linkText("Leads")).click();
		  
		  //Click on the create lead
		  driver.findElement(By.linkText("Create Lead")).click();
		  
		  driver.close();
	}

}
