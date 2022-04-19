import java.util.Scanner;
class Sign
  {
    public static void main(String args[])
    {
      int f;
      System.out.println("enter f value");
      Scanner sc=new Scanner(System.in);
      f=sc.nextInt();
      if(f<0)
      {
        System.out.println("negative");
        
      }
      else
      {
        System.out.println("positive");
      }
      
    }
  }