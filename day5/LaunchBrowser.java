package week2.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		
		//Instantiate the browser driver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get ("https://www.facebook.com/");
		//http://leaftaps.com/opentaps/control/main
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Close all the browser windows
		driver.quit();
		//Close the browser window which is on focus
	//	driver.close();
		
		
	}

}
