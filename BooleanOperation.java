/*  JFM1T2_Assignment3:

     Print the results for the following statements considering x = true and y = false
             1. x&&y
             2. x||y
             3. !x
             4. !y
     Prompt the user input from the terminal.
             
     Sample Input:
     Enter x as boolean value(true/false): 
     true
     Enter y as boolean value(true/false): 
     false
     
     Expected Output:
     x&&y is: false
     x||y is: true
     !x is: false
     !y is: true

*/

//import statements for java program to read inputs using Scanner class

 class BooleanOperation 
{

public static void main(String args[])
  {
    boolean x=true;
    boolean y=false;
    
    System.out.println("x&&y="+(x&&y));
    System.out.println("x||y="+(x||y));
    System.out.println("!x="+(!x));
    System.out.println("!y="+(!y));
  
    
    
  }


//print apppropriate result for boolean operations

}