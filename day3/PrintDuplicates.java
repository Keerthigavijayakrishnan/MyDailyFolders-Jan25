package week1.day3;

import java.util.Arrays;

public class PrintDuplicates {
	
	
	  public static void main(String[] args) {
		  
		  int[] num= {2,5,7,7,5,9,2,3};
		  //sort the array
		  Arrays.sort(num);
		  //Print the sorted array values
		  System.out.println("Array Sorting: "+ Arrays.toString(num));
		  
		  System.out.println("Duplicate Values: ");     
		  
		  //Method 1
		  
		  //Iterate all the values                      
		  for (int i=0; i<num.length-1; i++) {          
			  
			  //Compare the value with same value
			  if (num[i]==num[i+1]) {                 
				  System.out.println(num[i]);
			  }
		  }
		  
/*		  //Method 2
	  
         for (int i=0; i<num.length; i++) {        
         for (int j=i+1; j<num.length; j++)   {     
           if (num[i]==num[j]) {                 
				  System.out.println(num[i]);
			  }
		  }
		  }     */      

		  
	}
	

}
