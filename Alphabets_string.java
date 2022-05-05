import java.util.Scanner;
class Alphabets_string
{
  public static void main(String[] args)
  {
    System.out.println("enter the elements ");
    Scanner sc = new Scanner(System.in);
    
    String str1=sc.nextLine();
    int count=0;
    for (int i=0;i<str1.length();i++)
    {
       if(Character.isLetter(str1.charAt(i)))
count++;
    }
System.out.println("the number of alphabets in the given string is:"+count);

       
  }
}