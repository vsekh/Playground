import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=n-1;
      int num=1;
      for(int i=1;i<=n;i++)
      {
       
         if(i%2==1)
         {
           for(int t=1;t<=k;t++)
           {
            System.out.print(num); 
           }
           num=num+1;
           System.out.print(num);
         }
         else
         {
           num=num+1;
           System.out.print(num);
           num=num-1;
           for(int t=1;t<=k;t++)
           {
             System.out.print(num);
           }
           num=num+1;
         }
            System.out.print("\n"); 
       
     
        
      }
	}
}