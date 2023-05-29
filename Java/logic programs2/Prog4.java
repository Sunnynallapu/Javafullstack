//Program for sum of factors

import java.util.Scanner;
class Prog4
{
  public static void main(String args[])
  {
    Scanner aObj=new Scanner(System.in);
    System.out.println("enter integer");
    int n=aObj.nextInt();
      int sum=0;
     for(int a=1;a<=n;a++)
 
     {
       if(n%a==0)
        {
       sum=sum+a;
        }
      }
        System.out.println("sum of the factors");
        System.out.println(sum);
     
  }
 }