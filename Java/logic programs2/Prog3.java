//Program for factors

import java.util.Scanner;
class Prog3
{
  public static void main(String args[])
  {
    Scanner aObj=new Scanner(System.in);
    System.out.println("enter an integer");
     int n=aObj.nextInt();
     for(int a=1;a<=n;a++)
      {
        if(n%a==0)
      

   System.out.println(a);
      }
   }
}





