import java.util.Scanner;
class Perfectnumber
 {
   public static void main(String args[])
   {
     Scanner scObj=new Scanner(System.in);
     System.out.println("enter an integer number?");
     int i=1,sum=0;
     int a=scObj.nextInt();
      while(i<a)
        {
          if(a%i==0)
          {
            sum=sum+i;
          }
            i++;
        }
         if(sum==a)
          {
          System.out.println("perfect number");
          }
         else
          {
          System.out.println("not number");
          }
    }
}
    
         
         
           
