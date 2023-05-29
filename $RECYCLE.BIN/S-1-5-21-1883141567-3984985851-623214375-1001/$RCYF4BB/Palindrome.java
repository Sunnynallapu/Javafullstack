import java.util.Scanner;
class Palindrome
{
 public static void main(String args[])
   {
      
   Scanner scObj=new Scanner(System.in);
   System.out.println("enter an integers");
   int r,s=0,n,a;
   n=scObj.nextInt();
   a=n;
    while(n>0)
    {
      r=n%10;
      s=s*10+r;
      n=n/10;
 
      }
if(a==s)
      {
      System.out.println("Palindrome");
      }
   else
      {
        System.out.println(" not Palindrome");
      }
   }
}
    
 


