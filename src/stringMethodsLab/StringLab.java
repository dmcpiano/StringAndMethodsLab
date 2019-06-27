package stringMethodsLab;

import java.util.Scanner;

public class StringLab {


	public static void main(String [] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a word. ");
		String word = "food"; //scnr.nextLine();
		capitalize(word);
		
		System.out.println("Write a sentence that includes the world 'Waldo'. ");
		String phrase = "Hey, where is Waldo?"; // scnr.nextLine();
		wheresWaldo(phrase);
		
		System.out.println("Enter two words. ");
		String a = "pie"; // scnr.nextLine();
		String b = "cutie"; // scnr.nextLine();
		firstThingsFirst(a, b);
		
		System.out.println("Enter a word you would like to see written backwards. ");
		String s = "hilarious"; // scnr.nextLine();
		reverse(s);
		
		/*System.out.println("Enter two words. "); // hit a wall with soLong exercise 
		a = "happy"; // scnr.next();
		b = "birthday"; // scnr.next();
		System.out.println(soLong(a, b)); */
		
		System.out.println("Enter a phrase containing the word 'math'. "); //can't figure out how to do after the word math, keeps returning before the word
		phrase = "I enjoy math and physics the most. ";
		afterMath(phrase);
		
		System.out.println("Enter a word. ");
		word = "orange"; //scnr.nextLine();
		letterize(word);
		
	} 
	
	public static void capitalize(String word) {
		
		String firstLetter = word.substring(0, 1).toUpperCase();
		String restOfWord = word.substring(1).toLowerCase();
		word = firstLetter + restOfWord;
		System.out.println(word);
		
	}
	
	public static void wheresWaldo(String phrase) {
		
		phrase = phrase.toLowerCase();
		System.out.println(phrase.indexOf("waldo"));
		
	}
	
	public static void firstThingsFirst(String a, String b) {
		
		int firstThingsFirst = a.compareTo(b);
		
		if (firstThingsFirst < 0) {
			System.out.println(a + " " + b);
		} else if (firstThingsFirst > 0) {
			System.out.println(b + " " + a);
		} else {
			System.out.println(a + " " + b);
		}
		
	}
	
	public static void reverse(String s) {
		
        String reverse = new StringBuffer(s).reverse().toString();
        System.out.println(reverse);
        
	}
	
/*public static String soLong(String a, String b) { // hit a wall with this exercise
		
		Scanner scnr = new Scanner(System.in);
		
		boolean soLong = (a.length() > b.length());
		
		if soLong {
			
			System.out.println(a);
			
		} else {
			
			System.out.println(b);
		}
			
	}	*/
	
	public static void afterMath(String phrase) { //can't figure out how to do after the word math, keeps returning before the word
		
		phrase = phrase.toLowerCase();
		phrase.indexOf("math");
		
		int afterMath = phrase.indexOf("math");
		
	    if (afterMath >= 0) {
		 System.out.println(phrase.substring(0, afterMath));
		 
		} else {
				System.out.println("dud");
	    }
	    
	}
	
	public static void letterize (String word) {
		
		for(char a : word.toCharArray()){
            System.out.println(a);
		
	}
		
	}
	
	
}
	
	
	
	








