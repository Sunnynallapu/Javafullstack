import java.util.Scanner;
class Armstrong
{
 public static void main(String args[])
   {
      
   Scanner scObj=new Scanner(System.in);
   System.out.println("enter an integers");
   int r,s=0,n;
   n=scObj.nextInt();
   
    while(n>0)
    {
      r=n%10;
      s=s*10+r;
      n=n/10;
 
      }
System.out.println(s);  
   }
}
    
 


