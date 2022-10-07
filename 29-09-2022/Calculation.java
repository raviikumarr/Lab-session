
//program:ques 3- program for Calculation (taking 3 input variable, 2 for operators and 1 for operands and perfrom "+,-,*,/" operation)

import java.util.Scanner;

class Calculation {
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		// taking input from user

		System.out.println("Enter first num:");
		int num1 = sc.nextInt();
		System.out.println("Enter second num:");
		int num2 = sc.nextInt();
		System.out.println(
				"Enter 1 for addition\n\nEnter 2 for subtraction\nEnter 3 for multiplication\nEnter 4 for divison\n\n");
		int choice = sc.nextInt();
		// checking for 4the condition
		if (choice == 1) {
			num1 += num2;
			System.out.print("num1 + num2 = " + num1);
		} else if (choice == 2) {
			num1 -= num2;
			System.out.print("num1 - num2 = " + num1);
		} else if (choice == 3) {
			num1 *= num2;
			System.out.print("num1 * num2 =" + num1);
		} else if (choice == 4) {
			num1 /= num2;
			System.out.print("num1 / num2 =" + num1);
		} else {
			System.out.println("\ninvalid input");
		}
	}
}
