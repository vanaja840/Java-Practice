/* JFM1T4_Assignment4:
   Write a program to print the following pattern:
     1 
     01 
     101 
     0101 
     10101 
*/

 class Pattern 
     

{
   public static void main(String[] args)
   {
      int a, b, x, y;
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter number of rows to print pattern: ");
      int rows = sc.nextInt();
      for(a = 1; a <= rows; a++)
      {
         if(a % 2 == 0)
         {
            x = 1;
            y = 0;
         }
         else
         {
            x = 0;
            y = 1;
         }
         for(b = 1; b <= a; b++)
         {
            if(b % 2 == 0)
            {
               System.out.print(x);
            }
            else
            {
               System.out.print(y);
            }
         }
         System.out.println("");
         sc.close();
      }
   }
}


