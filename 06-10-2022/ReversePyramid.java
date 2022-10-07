
 //ques2: WAP program to print the reverse pyramid
 
 

import java.util.Scanner;

class ReversePyramid {

	public static void main(String[] args) {
		
        
		Scanner sc =new Scanner(System.in);
		 //getting input value from user
		System.out.println("Enter size of pyramid:");
		int size=sc.nextInt();
		//using (for-loop) 
		for (int i= 0; i<= size-1; i++)
	    {
	      for (int j=0; j<=i; j++)//for loop to print the space
	      {
	        System.out.print(" ");
            //
	      }
	    
	      for (int k=0; k<=size-1-i; k++)//this loop will print the stars and space
	      {
	        System.out.print("#" + " ");
	      }
	      
	      System.out.println();
	    }
	}
}
