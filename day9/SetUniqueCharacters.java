package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetUniqueCharacters {
	public static void main(String[] args) {
		String companyName = "google";
		//Convert from string into char
		char[] charCompany = companyName.toCharArray();
		
		//Create a TreeSet to remove duplicates
		Set<Character> uniqueCharacter = new LinkedHashSet<Character>();
		
		//Iterate the character 
		for (int i=0; i<charCompany.length; i++) {
			//Add each character into the set
			uniqueCharacter.add(charCompany[i]);
			
		}
		System.out.println("Added in Set: "+uniqueCharacter);
	}

}
