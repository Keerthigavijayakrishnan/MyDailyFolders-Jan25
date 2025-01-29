package week2.day3;

//Sub class -Browser 2
public class Edge extends Chrome{
	//Method1
		public void takeSnap() {
			System.out.println("Take a snap");
		}
		//Method2
			public void clearCookies() {
				System.out.println("Cookies Cleared");
			}

			public static void main(String[] args) {
				Edge edge = new Edge();
				edge.takeSnap();
				edge.clearCookies();
				edge.openIncognito();
				edge.clearCache();
				edge.openURL();
				edge.closeBrowser();
				edge.navigateBack();
				
			}
}
