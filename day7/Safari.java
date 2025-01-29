package week2.day3;

//Sub class - Browser 3
public class Safari extends Edge{
	//Method1
		public void readerMode() {
			System.out.println("Reade Mode ON");
		}
		//Method2
			public void fullScreenMode() {
				System.out.println("Full Screen Activated");
			}

			public static void main(String[] args) {
				Safari safari = new Safari();
				safari.readerMode();
				safari.fullScreenMode();		
				safari.takeSnap();
				safari.clearCookies();
				safari.openIncognito();
				safari.clearCache();
				safari.openURL();
				safari.closeBrowser();
				safari.navigateBack();
				
			}
}
