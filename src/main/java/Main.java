/*

Class: COP 2800: Java Programming
Instructor: Francis Fiskey

*6.5 (Sort three numbers) Write a method with the following header to display three numbers in increasing order:

public static void displaySortedNumbers(double num1, double num2, double num3)

Write a test program that prompts the user to enter three numbers and invokes the method to display them in increasing order.

Due: Oct 27 by 11:59pm

I pledge by honor that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Sign here:   
 ___Eric Snyder___

*/

import java.util.Scanner; // import the scanner class

public class Main { // open the class block

  public static void main(String[] args) { // open the main method block

    // create a scaner object named input which will be used to receive
    Scanner input = new Scanner(System.in); // input from the user

    // prompt the user to enter three numbers
    System.out.println("Enter three numbers please.\n ");

    // declare three variables to hold the three numbers
    double num1, num2, num3;

    // Prompt the user for the first number
    System.out.print("\nEnter the first number: ");

    // capture the input and store it in the variable num1
    num1 = input.nextDouble();

    // Prompt the user for the second number
    System.out.print("\nEnter the second number (different from the first): ");

    // capture the input and store it in the variable num2
    num2 = input.nextDouble();
    
    // Ensure the second number does not match the first number
    while (num2 == num1) {

      // Remind the user to enter a different number
      System.out.print("\nDifferent from the first number, please: ");

      // Attempt to capture the second number again
      num2 = input.nextDouble();

    } ;


    // Prompt the user for the third number
    System.out.print("\nEnter the third number (different from the first two): ");

    // capture the input and store it in the variable num3
    num3 = input.nextDouble();
    
    // Ensure the third number is different from the first two
    while (num3 == num1 || num3 == num2) {

      // Remind the user to enter a different number
      System.out.print("\nDifferent from the first two, please: ");

      // Attempt to capture the second number again
      num3 = input.nextDouble();

    };

    // call the displaySortedNumbers method and pass the three numbers
    displaySortedNumbers(num1, num2, num3); // as arguments to sort

    // close the scanner object to free up resources
    input.close();
  } // close the main method block



  // create a method used for sorting three numbers
  public static void displaySortedNumbers(double num1, double num2, double num3) { // open the method block

    // declare a variable to hold the smallest number, the middle
    double smallest, middle, largest; // number and the largest number

    // If argument 1 is the smallest
    if (num1 < num2 && num1 < num3) {

      smallest = num1; // assign argument 1 to the smallest variable

      // while num1 is the smallest, check if num2 is the middle
      if (num2 < num3) { middle = num2; largest = num3; } 

      // otherwise num2 is the largest
      else { middle = num3; largest = num2; }
    }

    // If argument 2 is the smallest
    else if (num2 < num1 && num2 < num3) {

      smallest = num2; // assign argument 2 to the smallest variable

      // while num2 is the smallest, check if num1 is the middle
      if (num1 < num3) { middle = num1; largest = num3; } 

      // otherwise num1 is the largest
      else { middle = num3; largest = num1; }
    } 
    
    // If argument 3 is the smallest
    else {

      smallest = num3; // assign argument 3 to the smallest variable
      
      // while num3 is the smallest, check if num1 is the middle
      if (num1 < num2) { middle = num1; largest = num2; } 

      // otherwise num1 is the largest
      else { middle = num2; largest = num1; }
    }

    // Display the numbers in increasing order
    System.out.println("\n\nThe numbers in increasing order are " + smallest + " " + middle + " " + largest);

  } // close the method block

} // close the class block