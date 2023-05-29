import java.util.Scanner;
class Array6
{
  public static void main(String args[])
  {
     Scanner scObj=new Scanner(System.in);
     System.out.println("enter height of 10 employee:- \n");
      float a[]=new float[10];
      float sum=0,average;
       for(int i=0;i<10;i++)
       {
     
       a[i]=scObj.nextFloat();
      sum=sum+a[i];
        }
  System.out.println(sum);
     average=sum/10;
System.out.println(average);
   }
 }
        
