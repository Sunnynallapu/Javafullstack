import java.util.Scanner;
class Array7
{
  public static void main(String args[])
  {
     Scanner scObj=new Scanner(System.in);
     System.out.println("enter height of 10 employee:- \n");
      float a[]=new float[10];
      float sum=0,average;
       for(float i:a)
       {
     
      i=scObj.nextFloat();
      sum=sum+i;
        }
  System.out.println(sum);
     average=sum/10;
System.out.println(average);
   }
 }       
