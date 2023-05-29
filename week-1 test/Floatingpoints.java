import java.util.Scanner;
class Floatingpoints
 {
   public static void main(String args[])
   {  
 Scanner scObj=new Scanner(System.in);
   System.out.println("enter an first number");
   float a=scObj.nextFloat();

   System.out.println("enter an Second number");
   float b=scObj.nextFloat();
  System.out.println("Before swaping:"+a+" "+b);
  
      a=a+b;
      b=a-b;
      a=a-b;
       System.out.println("After swaping:"+a+" "+b);
         
    }
}
         
       
   
     
