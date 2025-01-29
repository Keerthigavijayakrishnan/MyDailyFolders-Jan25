package week2.day3;

//Sub class -Browser 1
public class Chrome extends Browser {
	//Method1
	public void openIncognito() {
		System.out.println("Incognito tab opened");
	}
	//Method2
		public void clearCache() {
			System.out.println("Cache Cleared");
		}
public static void main(String[] args) {
	Chrome chrome = new Chrome();
	chrome.openIncognito();
	chrome.clearCache();
	chrome.openURL();
	chrome.closeBrowser();
	chrome.navigateBack();
	
}
}
