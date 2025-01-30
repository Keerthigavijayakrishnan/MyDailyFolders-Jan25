package week2.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLowestMobiles {

	public static void main(String[] args) {
		
		//Initialize the WebDriver
		 ChromeDriver driver = new ChromeDriver();
		 //Load the URL
	     driver.get ("https://www.amazon.in/");
		 //Maximize the browser window
	     driver.manage().window().maximize();
	     //Implicit wait- for handling captcha (In the wait time, we can manually enter the captcha)
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     //Find Element and Enter the Search text 
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile Phone");
	     //Find Element and Select the Search icon
	     driver.findElement(By.id("nav-search-submit-button")).click();
	     
	     //Phone Prices in the page get into List<Element>
	     List<WebElement> allRates = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	     //Verify the Size 
	     int numberOfResults = allRates.size();
	     System.out.println("Number of Results: "+numberOfResults);
	     
	     //Create another list for String
	     List<String> allStrings = new ArrayList<String>();
	    	     //Get all the Rates 
	     for (int i=0; i<numberOfResults; i++) {
	    	String rates1 = allRates.get(i).getText();
	    	String rates2=  rates1.replace(",", " ");
	    	String rates3 = rates2.replace(" ", "");
	    	allStrings.add(rates3);
	    	
	     } 
	     // Convert the list of strings to a list of integers
	        List<Integer> allIntegers = new ArrayList<Integer>();
	        for (String str : allStrings) {
	            allIntegers.add(Integer.parseInt(str)); // Convert String to Integer
	        }
	        //Sort the Rates
	     Collections.sort(allIntegers);
	     System.out.println("Sorted List of Mobile Phones: " +allIntegers);
	     
	     //Close the Browser
	     driver.close();
	    
	}
}
