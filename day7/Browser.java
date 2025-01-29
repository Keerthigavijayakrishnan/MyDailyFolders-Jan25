package week2.day3;

//Inheritance Classes- Browser, Chrome, Edge, Safari
//SuperClass 
public class Browser{
	
	String browserName ="Name of the Browser";
	float browserVersion = 3.10f;
	//Method1
	public void openURL() {
		System.out.println("URL Launched" +browserName+" "+browserVersion);
	}
	//Method2
	public void closeBrowser() {
		System.out.println("Browser Closed");
	}
	//Method3
	public void navigateBack() {
		System.out.println("Navigated back!");
	}
	
	public static void main(String[] args) {
		Browser browser = new Browser();
		browser.openURL();
		browser.closeBrowser();
		browser.navigateBack();

		
	}
	

}
