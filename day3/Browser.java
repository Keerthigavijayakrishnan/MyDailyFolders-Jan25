package week1.day3;

public class Browser {

	//method1
	public String launchBrowser() {
		return "Chrome";
		
/*		//method2
		public String launchBrowser(String browsername) {
			return browsername;     */

	}
	
	private void loadUrl() {
	System.out.println("Browser Launched Successfully");

	}
	
	public static void main(String[] args) {
		 Browser browser1 = new Browser ();
		 //method1
		System.out.println(browser1.launchBrowser());	 
	//	method2
	//	 System.out.println(browser1.launchBrowser("Chrome"));
		 
		 browser1.loadUrl();
		 
	}

}
