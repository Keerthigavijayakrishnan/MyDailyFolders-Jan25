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
		  
		  //Iterate all the values                      //length=8, length-1=7
		  for (int i=0; i<num.length-1; i++) {          //0<7,1<7,2<7,3<7,4<7, 5<7,6>7, 7>7 (loops stop).if num.length=8,so 7>8 (loop continue)
			  
			  //Compare the value with same value
			  if (num[i]==num[i+1]) {                  //2=2, 2=3, 3=5,5=5,5=7,7=7,7=9. If loop continue here, n[i]=9 but n[i+1}+].no value and outofboundexception error
				  System.out.println(num[i]);
			  }
		  }
		  
/*		  //Method 2
	  
         for (int i=0; i<num.length; i++) {         //0=2,1=2,2=3,3=5,4=5,5=7,6=7,7=9 (loop stop)
         for (int j=i+1; j<num.length; j++)   {     //2355779
           if (num[i]==num[j]) {                 
				  System.out.println(num[i]);
			  }
		  }
		  }     */      

		  
	}
	

}
