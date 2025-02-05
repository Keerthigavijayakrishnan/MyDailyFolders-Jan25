package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) {
		
		 //Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://www.irctc.co.in/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    
		//Click on the "FLIGHTS" link. 
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		//Capture the title of the new window that opens (flights window - AirTicket)
		       //Get all window address into set
		Set<String> allWindowAddress = driver.getWindowHandles();
		System.out.println("Address of all windows: "+allWindowAddress);
		      //Empty list and add the set element into list
		List<String> allWindows = new ArrayList<String>(allWindowAddress);
		      //Switch the drive focus into new window
		driver.switchTo().window(allWindows.get(1));
		      //Get the title of new window
		String titleOfNewWindow = driver.getTitle();
		System.out.println("Title of New Window: "+titleOfNewWindow);
		
		//Close the parent tab (Train ticket booking) alone.
	           //Switch the drive focus into parent window
		driver.switchTo().window(allWindows.get(0));
		       //Close the parent(focus) window alone.
		driver.close();
		
		
		//Close all windows
		//driver.quit();
	}

}
