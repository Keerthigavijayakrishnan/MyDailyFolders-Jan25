package week1.day4;

public class ReverseString {
	
	public static void main(String[] args) {
		
		//Method1
		String companyName = "TestLeaf";
		
		//Convert the string into character array
		char[] CharArray = companyName.toCharArray();
		System.out.println("Reverse String: ");
		
		//Loop to iterate through each character of the string in reverse
		for (int i=CharArray.length-1; i>0; i--) {         
			                                              
			System.out.println(CharArray[i]);              
			
		} 
	     
	}
	}

		
/*	//	Method2
		String companyName = "TestLeaf";                     
		String rev ="";                                     
		for (int i=companyName.length()-1; i>=0; i--) {      
			rev = rev+companyName.charAt(i);			   
		}
		System.out.println(rev);		                    
	}      

}   */
