class Fibonocci
{
 public static void main(String args[])
  
   {
      int a=1,f1=0,f2=1,n=10,f3;
      System.out.println(f1);
 System.out.println(f2);

   for(a=1;a<=n;a++)
      {
         f3=f1+f2;
         f1=f2;
         f2=f3;
         
        System.out.println(f3);
      
       }
    


   }
}

        