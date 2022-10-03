 //Program:Ques2. Create a program to find largest of two numbers.
 

import java.util.Scanner;
public class LargestTwoNoo {

	   public static void main(String[] args)
	   {

	      int numberOne, numberTwo, largest;
		  //input from the user
	      Scanner a = new Scanner(System.in);
	      
	      System.out.print("Enter the First Number: ");
	      numberOne = a.nextInt();
	      System.out.print("Enter the Second Number: ");
	      numberTwo = a.nextInt();
		  
	      //checking the largest number

	      if
	      (numberOne>numberTwo)
	         largest = numberOne;
	      
	      else {
	         largest = numberTwo;
	      }
	      System.out.println("\nLargest = " +largest);
	   }
	}