import java.util.Scanner;
class Factors
{
  public static void main(String [] args)
    {
	Scanner sc=new Scanner(System.in);
       System.out.print("enter a number:");
 	 int n=sc.nextInt();
       System.out.print("factors of a given number is: ");
       for(int a=1;a<=n;a++)
       {
         if(n%a==0)
         {
            System.out.print(a+" ");
         }
   
	 }
    }
 
}