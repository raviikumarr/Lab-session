
// ques2: WAP program for checking the password is right or wrong


import java.util.Scanner;

class CheckingPassword {

	public static void main(String[] args)

	{
		 //creating scanner object to take input from user 

		Scanner sc= new Scanner(System.in);

		//input from user
		System.out.println("Enter the username:");
		String username= sc.nextLine();
		System.out.println("Enter the password");
		int pw=sc.nextInt();

		//by if-else for checking condition
		if(pw==9876)
		{
			System.out.println(username + " Your password is right");
		}
		else
		{
			System.out.println(username + " Invalid password! Try again");
		}
	}
}
