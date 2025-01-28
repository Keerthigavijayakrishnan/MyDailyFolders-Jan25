package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	public static void main(String[] args) {
		//Initialize the WebDriver
		 ChromeDriver driver = new ChromeDriver();
		 //Load the URL
	     driver.get ("http://leaftaps.com/opentaps/control/main");
		 //Maximize the browser window
	     driver.manage().window().maximize();
		  
	   //SendKeys - To enter data in text field
	     //Enter the user name  -findElement
	     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	     	     
	     //Enter the password
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     
	     //Click on the login button
	     driver.findElement(By.className("decorativeSubmit")).click();
	     
	     //Click on the CRMSFA link
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     
	     //Click on the Leads
	     driver.findElement(By.linkText("Leads")).click();
	     
	     //Click on the CreateLead
	     driver.findElement(By.linkText("Create Lead")).click();
	     
	     //Enter the companyName
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	     
	     //Enter the firstName
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
	     
	     //Enter the lastName
	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
	     
	     
	     //Handling the dropdown -Source
	     //Step1: Find the Element
	     WebElement sourceDropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));	  
	     
	     //Step2: Instantiate the Select Class
	     Select dd1=new Select(sourceDropdown1);
	     
	     //Step3: Select the option
	     //By Index
	     //dd1.selectByIndex(3);	     
	     //By Value
	     //dd1.selectByValue("LEAD_EXISTCUST");	     
	     //By Text
	     dd1.selectByVisibleText("Public Relations");
	     
	     //Industry Dropdown
	     WebElement sourceDropdown2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	     Select dd2=new Select(sourceDropdown2);
	     //By Index
	     dd2.selectByIndex(16);	     
	     //By Value
	     //dd2.selectByValue("IND_HARDWARE");	     
	     //By Text
	     // dd2.selectByVisibleText("Computer Software");
	     
	     //Click Create lead button
	     // driver.findElement(By.name("submitButton")).click();
	     
	     }
		  
		 
	}


