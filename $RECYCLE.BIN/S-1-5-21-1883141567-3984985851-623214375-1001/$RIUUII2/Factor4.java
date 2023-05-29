import java.util.Scanner;
class Factor4
 {
   public static void main(String args[])
   {
   Scanner scObj=new Scanner(System.in);
   System.out.println("enter an number");
   int n=scObj.nextInt();
    int count=0;
   for(int a=1;a<=n;a++)
      {
        if(n%a==0)
         {
           
          count++;
         
         }
         
       }
          System.out.println("count of factors");

             System.out.println(count);
     }
  }