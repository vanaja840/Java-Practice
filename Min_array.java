import java.util.Scanner;
class Min_array
{
    public static void main(String args[])
      {
        
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array elements");
        for(i=0;i<5;i++)
          {
            a[i]=sc.nextInt();
          }
        int min=a[0];
        System.out.println("minimum value");
          for(i=0;i<5;i++)
          {
            if(a[i]<min)
            {
            
             min=a[i];
            }
          }  
            System.out.println(min);
          
      }
}