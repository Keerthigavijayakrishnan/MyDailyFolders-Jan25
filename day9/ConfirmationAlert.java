package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Find the element
		driver.findElement(By.xpath("(//span[contains(text(),'Show')])[2]")).click();
		
		//Transfer the driver focus to alert box
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		//Handling the alert
		String text = confirmAlert.getText();
		System.out.println(text);
		//confirmAlert.accept();                 //for select, Ok
		confirmAlert.dismiss();                  //for select, cancel
	} 

}
