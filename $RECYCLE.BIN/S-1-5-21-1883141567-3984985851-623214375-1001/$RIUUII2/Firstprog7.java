import java.util.Scanner;
class Firstprog7
{
  public static void main(String args[])
  {
     Scanner scObj=new Scanner(System.in);
     System.out.println("enter upto which");
      int n=scObj.nextInt();
      int f=1;
     for(int a=1;a<=n;a=a+1)
      {
        f=f*a;
      }
       System.out.println("factorial="+f);
   }
}
       

     