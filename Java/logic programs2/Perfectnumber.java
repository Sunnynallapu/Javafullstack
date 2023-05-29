import java.util.Scanner;
 class Perfectnumber
 {
   public static void main(String args[])
   {
   Scanner aObj=new Scanner(System.in);
   System.out.println("enter integer");
    int a=1,sum=0,n;
   n=aObj.nextInt();
   for(a=1;a<n;a++)
   {
     if(n%a==0)
      {
       sum=sum+a;
      
      }
      
    }
      if(n==sum)
       {
      System.out.println("perfect number");

       }
         else
         {
		System.out.println("not perfect number");
          }
  }
}

