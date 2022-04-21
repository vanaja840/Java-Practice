//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=38
   

*/ 

//import statement for java program to read inputs using Scanner class 
import java.util.Scanner;
public class Circle { 
     //Define main method
     public static void main(String[] args){
        //Declare the variables
        int radius;
        float value;
        int circumference;
        //Use the scanner class to provide radius at execution time
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius as a positive integer");
        radius= scanner.nextInt();
       //Caluculate the circumference of the circle
        value = (float)Math.PI*2*radius;
       //Casting the floating-point value to int 
       circumference = (int)value;
       //Print the Result
       System.out.println("Circumference of the circle = "+circumference);
    }
} 