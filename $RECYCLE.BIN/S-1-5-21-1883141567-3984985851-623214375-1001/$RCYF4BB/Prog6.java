//Program for display odd numbers and sum of odd

class Prog6
{
  public static void main(String args[])
  {
    int n=15,sum=0,a=1,odd=1;
    while(a<=n)
     {
        
       if(a%2!=0)
        {
           sum=sum+a;
   
          System.out.println(a);
        }
          ++a;
      }
          System.out.println("odd="+sum);
   }
}
    
