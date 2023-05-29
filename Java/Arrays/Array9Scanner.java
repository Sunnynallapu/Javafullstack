import java.util.Scanner;
class Array9Scanner
{
  public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter rows and columns");
    int rows=sc.nextInt();
     int col=sc.nextInt();
      int a[][]=new int[rows][col];
  System.out.println("enter array values");
     for(int r=0;r<rows;r++)
       {
        for(int c=0;c<col;c++)
         {
           a[r][c]=sc.nextInt();
         }    
     }
       
  for(int r=0;r<rows;r++)
       {
        for(int c=0;c<col;c++)
         {
           System.out.print(a[r][c]+ " ");
         }   
           System.out.println(); 
     }
   }
}
      