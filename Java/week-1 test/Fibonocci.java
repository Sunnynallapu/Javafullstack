import java.util.Scanner;
class Fibonocci
{
public static void main(String args[])
{
   int f1=0,f2=1,f3;
  Scanner sc=new Scanner(System.in); 
  System.out.println("enter an number");
  int n=sc.nextInt();
  
  System.out.println(f1+" "+f2+" ");
   for(int i=2;i<=n;i++)
   {  
      f3=f1+f2;
     System.out.println(f3);
      f1=f2;
      f2=f3;
   }
}
}
  