//Program for factorial

import java.util.Scanner;
class Prog2
 {
    public static void main(String args[])
   {
      Scanner aObj=new Scanner(System.in);
      System.out.println("please enter any integer");
       int f=1;
      int n=aObj.nextInt();

     for(int b=1;b<=n;b++)
        {
             f=f*b;
         System.out.println(b);
         }
         System.out.println("f="+f);
}

}
       
      
      
      
    
     
   