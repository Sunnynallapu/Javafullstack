import java.util.Scanner;
class Evenodd
{
  public static void main(String args[])
  {
    Scanner scObj=new Scanner(System.in);
    System.out.println("enter any integer");
    int a=1,n,b=1,e=0,od=0;
    n=scObj.nextInt();
    
    System.out.println("even number");

    for(a=1;a<=n;a++)
       {
		if(a%2==0) 
          {
            System.out.println(a);
             e++;
           }
       
        }
         System.out.println("even count ="+e);
          
     System.out.println("odd number");
      for(b=1;b<=n;b++)
        {
          if(b%2!=0)
           {
             System.out.println(b);
                 od++;
           }
        }
         System.out.println("odd count ="+od);
         
    }
 }
 
         