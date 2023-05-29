import java.util.Scanner;
class Array5
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter an array");
     char b[]=new char[5];
int n=sc.nextInt();
       for(int i=0;i<n;i++)
        {
          b[i]=sc.next().charAt(i);
        }
      System.out.println("vowels are");

      for(int i=0;i<n;i++)
         {
           System.out.println(b[i]);
         }
  }
}
          
