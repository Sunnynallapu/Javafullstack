import java.util.Scanner;
class Swap
{
 public static void main(String args[])
   {
      
   Scanner scObj=new Scanner(System.in);
   System.out.println("enter a,b value");
   int a,b,c;
   a=scObj.nextInt();
   b=scObj.nextInt();
   c=a;
   a=b;
   b=c;
 System.out.println("a="+a+"b="+b);
   }
}

        