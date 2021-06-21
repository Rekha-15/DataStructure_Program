/**
 * @purpose Implementing a Palindrome program.
 * @author rekha
 * @version 1.0
 *  @since 15-062021
 */

package palindrome.com;

import java.util.Scanner;

/**
 * PalindromeString is a class of public type Here user will gives the one
 * string value program should identify weather its palindrome or not
 * 
 * @author rekha
 *
 */

public class PalindromeString {

	/**
	 * main method
	 * First asking user to enter a string
	 * @param args - argument, its an actual value that are passed to variables
	 * converting string to array
	 * if entered string is palindrome prints back String is palindrome
	 * else String is not palindrome
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String nstr = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length / 2; i++) {
			char t = ch[i];
			ch[i] = ch[ch.length - 1 - i];
			ch[ch.length - 1 - i] = t;
		}
		nstr = new String(ch);
		if (nstr.equalsIgnoreCase(str)) {
			System.out.println(str + " : String is palindrome");
		} else {
			System.out.println(str + " : String is not palindrome");
		}
	}
}