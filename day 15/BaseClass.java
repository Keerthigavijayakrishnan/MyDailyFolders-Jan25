package week4.day3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
ChromeDriver driver = new ChromeDriver();
public String filename;
	@Parameters({"url", "username", "password"})
	
	
	@BeforeMethod
	public void preCondtions(String url, String uName, String pwd) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(uName);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	}
	
	@DataProvider
	public String[][] sendData() throws IOException{
			
		return ReadExcel.readData(filename);
		
	}
	
	
	@AfterMethod
	public void postCondtions() {
		driver.close();
	}

}
