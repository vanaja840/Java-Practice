/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

class Operations 
{

public static void main(String args[])
  {
    int x,y;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter x value :");
    x=sc.nextInt();
    System.out.println("enter y value :");
    y=sc.nextInt();
    System.out.println("x-y="+(x-y));
    System.out.println("x*y="+(x*y));
    System.out.println("x/y="+(x/y));
    System.out.println("++x="+(++x));
    System.out.println("--x="+(--x));
    System.out.println("x%y="+(x%y));
  }
  



/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//calculate difference,product,division,increment and remainder 

//print appropriate result for all operations

}