import java.util.Scanner;
class Two_array
{
  public static void main(String args[])
  {
    int i,j;
    int a[][]=new int[2][3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an array elaments :");
    for(int i=0;i<2;i++)
      {
        for(int j=0;j<3;j++)
        {
        a[i][j]=sc.nextInt();
        }
      }
       System.out.println(" array elaments :");
       for(int i=0;i<2;i++)
        {
          for(int j=0;j<3;j++)  
      
          {
          System.out.println(a[i][j]);
          }
        
  }
}