package javacodes;

/*
Write a program to check the given number is palindrome or not?
Descritpion : A Palindrome number is a number that remains the same when its digits are reversed. Like 16461, for example: we take 121 and reverse it, after revers it is same as original number
*/

package javacodes;

import java.util.Scanner;

class PalindromeOrNot {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    String input = scanner.next(); // Get input from user

    // Use StringBuilder to reverse the string
    String reversed = new StringBuilder(input).reverse().toString();

    // Check if the input and the reversed string are equal
    if (input.equals(reversed)) {
      System.out.println("The number is a palindrome.");
    } else {
      System.out.println("The number is not a palindrome.");
    }

    scanner.close();
  }
}

