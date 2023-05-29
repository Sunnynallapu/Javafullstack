import java.util.Scanner;
 class Primenumber
 {
   public static void main(String args[])
  {
    Scanner scObj=new Scanner(System.in);
    System.out.println("enter any number");
    int a,n,count=0;
    n=scObj.nextInt();
     for(a=1;a<=n;a++)
      {
	   if(n%a==0)
       {
 		count++;
        }
      }
		if(count==2)
            {
			System.out.println("prime number");
             }
               else
			{
				System.out.println("not prime number");
                }
   }
}