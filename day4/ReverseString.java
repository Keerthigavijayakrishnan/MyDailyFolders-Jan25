package week1.day4;

public class ReverseString {
	
	public static void main(String[] args) {
		
		//Method1
		String companyName = "TestLeaf";
		
		//Convert the string into character array
		char[] CharArray = companyName.toCharArray();
		System.out.println("Reverse String: ");
		
		//Loop to iterate through each character of the string in reverse
		for (int i=CharArray.length-1; i>0; i--) {         //0=T, 1=e, 2=s, 3=t, 4=l, 5=e, 6=a, 7=f
			                                               //length=8, length(8)-1=7
			System.out.println(CharArray[i]);              //CharArray[7]
			
		} 
	     
	}
	}

		
/*	//	Method2
		String companyName = "TestLeaf";                     //0=T, 1=e, 2=s, 3=t, 4=l, 5=e, 6=a, 7=f
		String rev ="";                                     //length=8, length(8)-1=7
		for (int i=companyName.length()-1; i>=0; i--) {     //7,6,... (intial value executes only first time and inc/dec value starts executes from  second loop. if i=companyName.length()-1 executes i-- not executes. if i-- executes, i=companyName.length()-1 not executes.)
			rev = rev+companyName.charAt(i);			    //0+CharAt[7]=f,...
		}
		System.out.println(rev);		                    //f,   
	}      

}   */
