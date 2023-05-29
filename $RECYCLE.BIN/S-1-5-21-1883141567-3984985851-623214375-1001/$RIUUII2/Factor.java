import java.util.Scanner;
class Factor
{
  public static void main(String args[])
  {

    Scanner scObj=new Scanner(System.in);
    System.out.println("enter factorial");
    int n=scObj.nextInt();
    int a=1,f=1;

      while(a<=n)
 	{
        f=f*a;
         
         a++;
       }
     System.out.println(f);

    }
}


