//Program for count of factors

import java.util.Scanner;
class Prog5
{
  public static void main(String args[])
  {
   Scanner aObj=new Scanner(System.in);
   System.out.println("enter any integer");
      int count=0;
   int n=aObj.nextInt();
   for(int a=1;a<=n;a++)
    {
	if(n%a==0)
      {
	  count++;
      }
    }
     System.out.println(count);
  }
 }

