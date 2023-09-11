/**
 * An application class that checks to see if an input string is a palindrome.
 * @author aelias
 */

import java.util.*;

public class PalindromeChecker {

	public static void main(String[] args) {
		/**
		 * Instantiating a string to hold the input string.
		 */
		String wordToBeChecked = "";
		
		/**
		 * Scanner receives input and assigns to wordToBeChecked.
		 */
		System.out.println("Enter a word in all lowercase to see if it is a palindrome:");
		Scanner sc = new Scanner(System.in);
		wordToBeChecked = sc.nextLine();
		
		/**
		 * New stack to receive characters pushed from input string.
		 */
		Stack stack = new Stack();
		
		/**
		 * For loop to push characters from input string to stack.
		 */
		for (int i = 0; i < wordToBeChecked.length(); i++) {
			stack.push(wordToBeChecked.charAt(i));
		}//end for loop pushing to stack
		
		/**
		 * Instantiating a new string to receive popped characters from the stack.
		 */
		String wordInReverse = "";
		
		/**
		 * Popping characters from the stack to wordInReverse.
		 */
		while (stack.isEmpty() == false) {
			wordInReverse += stack.pop();
		}//end while loop
		System.out.println("The word in reverse is: " + wordInReverse);
		
		/**
		 * Testing equality and printing appropriate result.
		 */
		if(wordToBeChecked.equals(wordInReverse)) {
			System.out.println("The word is a palindrome!");
		} else {
			System.out.println("The word is NOT a palindrome!");
		}//end if loop
		

	}//end main

}//end class
