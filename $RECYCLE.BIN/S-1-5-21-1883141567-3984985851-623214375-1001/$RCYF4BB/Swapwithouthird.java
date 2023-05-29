import java.util.Scanner;
class Swap1
{
 public static void main(String args[])
   {
      
   Scanner scObj=new Scanner(System.in);
   System.out.println("enter a,b value");
   int a,b;
   a=scObj.nextInt();
   b=scObj.nextInt();
   a=a+b;
   b=a-b;
   a=a-b;
 System.out.println("a="+a+"b="+b);
   }
}

        