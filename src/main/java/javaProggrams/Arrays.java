package javaProggrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Arrays
{
	public static void main(String[] args) 
	{	

		/*String[] str="thunder storm".split("t", 2);
		String stReplaceWord="";
		int j=1;
		for (int i =0; i < str.length; i++) 
		{
			stReplaceWord=str[i].replace("t", Integer.toString(j));
			System.out.println(stReplaceWord);
			j++;
		}
		*/

	String names[]= {"a","b","c","a","b","d","e"};

	for (int i = 0; i < names.length; i++) {
		for (int j = i+1; j < names.length; j++) {
			if (names[i].equals(names[j])) {
				System.out.println("Duplicate values are::"+names[i]);
			} 
			else  if (names[i].equals(names[j])==false) {
				
			}{
				System.out.println("unique values are::"+names[i]);
			}
			
			
			
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	/*ArrayList<String> duplicates=new ArrayList<String>();
	ArrayList<String> unique=new ArrayList<String>();
	
	for (int i = 0; i <names.length; i++) {
		if (!unique.contains(names[i])) {	
			unique.add(names[i]);	
		}
		else
		{
		
		duplicates.add(names[i]);
		}
	}
	System.out.println("Unique elements are"+unique);
	System.out.println("duplicate elements are"+duplicates);
	
	
	
	
	/*for (int i = 0; i <names.length; i++) {
		for (int j = i+1; j <names.length; j++) {			
			if (names[i].equals(names[j])) {				
				System.out.println("Duplicate element is::"  +names[i]);
			}
			else if (!names[i].equals(names[j])) {
				System.out.println("unique element is::"  +names[i]);
			}	
			}	
	
	Set<String> value=new HashSet<String>();
	for (String str : names) {
		if (value.add(str)==false) {

			System.out.println(" Duplicates value is::"+str);
		}
		else
		 {
			System.out.println(" unique values are::"+str);
		}*/
		
	
	
		
	}
	
	
	
	
		}	

		
	
		