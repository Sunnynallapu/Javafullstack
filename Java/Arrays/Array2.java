import java.util.Scanner;
class Array2
{
  public static void main(String args[])
  {
    Scanner scObj=new Scanner(System.in);
    System.out.println("enter an Array integer");
      
   int a[]=new int[5];
    for(int i=0;i<5;i++)
      {
         a[i]=scObj.nextInt();
       }
      System.out.println("array values are");
    for(int i=0;i<5;i++)
       {
          System.out.println(a[i]);
       }
    System.out.println("Length of array:"+a.length);
    }
 }
  



