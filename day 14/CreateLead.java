package week4.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week4.day2.BaseClass;

public class CreateLead extends BaseClass {
	
	@DataProvider
	public String[][] sendData(){
		String[][] data = new String[2][3];
		data[0][0]="Testleaf";
		data[0][1]="Hari";
		data[0][2]="R";
		
		data[1][0]="Qeagle";
		data[1][1]="Vineeth";
		data[1][2]="Rajendran";
		
		return data;
		
	}
	
@Test(dataProvider="sendData")
	public void runCreateLead(String company, String fName, String lName) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}

}
