package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameInteractions {
	public static void main(String[] args) {
		       //Initialize ChromeDriver
				ChromeDriver driver = new ChromeDriver();
				//Load the URL
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
				//Maximize the browser
				driver.manage().window().maximize();
				//Switch to the frame
				driver.switchTo().frame("iframeResult");
				//Implicit wait to ensure the web page elements are fully loaded
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				//Click "Try It" button inside the frame
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				
				
				//Click OK/Cancel in the alert
				//Switch to the alert
				Alert alert =driver.switchTo().alert();
				//For click OK
				alert.accept();
				//For click cancel
				//alert.dismiss();
				
				//Verify the text displayed in the frame
				String text2 ="OK";
				String text3 = "Cancel";
				String text1 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
				System.out.println("Displayed text in the frame: "+text1);
				if (text1.contains(text2) || text1.contains(text3))  {
					System.out.println(text1);
				}else {
					System.out.println("Action not performed in Alert");
				}
				
				//Switch to main webpage
				driver.switchTo().defaultContent();
				//switch to parent frame
				//driver.switchTo().parentFrame();
				
				//Close the browser
				driver.close();
				
				
	}

}
