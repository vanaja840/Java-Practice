import java.util.Scanner;
class Vote
  {
    public static void main(String args[])
    {
      int age;
      System.out.println("enter the age");
      Scanner sc=new Scanner(System.in);
      age=sc.nextInt();
                            
      if(age>=18)
      {
        System.out.println("valid  to vote ");
      
      }
      else
        System.out.println("invalid");
      
      
    
      
    }
  }