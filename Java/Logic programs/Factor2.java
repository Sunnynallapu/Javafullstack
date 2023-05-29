import java.util.Scanner;
class Factor2
 {
   public static void main(String args[])
   {
   Scanner scObj=new Scanner(System.in);
   System.out.println("enter an number");
   int n=scObj.nextInt();
    int sum=0;
   for(int a=1;a<=n;a++)
      {
        if(n%a==0)
         {
           sum=sum+a;
           System.out.println(a);
         
         }
         
       }
          System.out.println("Sum of factors");

             System.out.println(sum);
     }
  }