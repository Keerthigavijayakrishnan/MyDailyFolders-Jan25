package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableRetrieveColumn {
	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://leafground.com/table.xhtml");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//To find the column2 elements
         List<WebElement> column2 = driver.findElements(By.xpath("(//table)[6]/tbody[@id='form:j_idt89_data']/tr/td[2]"));
           //To retrieve data from column2
          System.out.println("Column 2: ");
          for (int i=0; i<=column2.size()-1; i++) {              //(or) for (int i=0; i<column2.size(); i++
          /*   //Method1
            WebElement allDataInColumn2 = column2.get(i);
        	System.out.println(allDataInColumn2.getText());
        	  //Method2
        	String allDataInColumn2 = column2.get(i).getText();
        	System.out.println(allDataInColumn2); */
        	  //Method3
        	 System.out.println(column2.get(i).getText());
        	
          }

	}

}
