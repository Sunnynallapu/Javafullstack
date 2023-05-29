class Digitsum
{
  public static void main(String args[])
  {
    int a=123,r,s=0;
   while(a>0)
     {
       r=a%10;
       s=s+r;
       a=a/10;
     }
       System.out.println(s);
   }
 }
       