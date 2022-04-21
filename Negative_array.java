import java.util.Scanner;
class Negative_array
{
    public static void main(String args[])
      {
        int i;
        int a[]=new int[4];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array elements");
        for(i=0;i<4;i++)
          {
            a[i]=sc.nextInt();
          }
        for(i=0;i<4;i++)
          {
            if(a[i]<0)
            {
             System.out.println(a[i]);
              }
          }
      }
}