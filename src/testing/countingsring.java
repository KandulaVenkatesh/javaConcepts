package testing;

import java.util.*;

public class countingsring {
	String input;
	
	public countingsring(String input) {
		super();
		this.input = input;
	}

	public void countWordsUsingSplit(String input) {
	    if (input == null || input.isEmpty()) {
	      int count=0;
	      System.out.println(count);
	    }

	    String[] words = input.split("\\s+");
	    int count=words.length;
	    System.out.println(count);
	  }
	
	public static Set<String> duplicateWords(String input)
	{
		
		if(input == null || input.isEmpty()){
		return Collections.emptySet(); }
	Set<String> duplicates = new HashSet<>();
	String[] words = input.split("\\s+");
	Set<String> set = new HashSet<>();
	for(String word : words){ 
		if(!set.add(word)){ duplicates.add(word); } 
		} return duplicates; } 

	


}
