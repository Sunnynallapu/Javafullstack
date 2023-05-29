import java.util.Scanner;
class Evenoddno
 {
   public static void main(String args[])
   {
     int a,b;
   Scanner scObj=new Scanner(System.in);
   System.out.println("enter an number");
   int n=scObj.nextInt();
System.out.println("Even numbers:");
     for(a=0;a<=n;a++)
      {
        if(a%2==0)
          {
          System.out.println(a+" ");
          }
       }
System.out.println("odd numbers:");
       for(b=0;b<=n;b++)
      {
         if(b%2!=0)
          {
	    System.out.println(b+" ");
          }
       }
         
    }
}
         
       
   
     
