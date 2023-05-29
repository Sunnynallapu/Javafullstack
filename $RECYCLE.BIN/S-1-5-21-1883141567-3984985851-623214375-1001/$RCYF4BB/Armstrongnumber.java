import java.util.Scanner;
class Armstrong
{
 public static void main(String args[])
   {
      
   Scanner scObj=new Scanner(System.in);
   System.out.println("enter an integers");
   int r,a,s=0,n;
   n=scObj.nextInt();
   a=n;
    while(n>0)
    {
      r=n%10;
      s=s+r*r*r;
      n=n/10;
 
      }
if(a==s)
{
 System.out.println("Armstrong");
}
else
{
System.out.println("not armstrong");
}
  
   }
}
    
 



