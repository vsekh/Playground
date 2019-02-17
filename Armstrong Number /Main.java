import java.util.Scanner;
class Main{
 
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int p=n,k=n;
      int c=0;
      while(p!=0)
      {
        p=p/10;
        ++c;
      }
     
      int s=0;
      while(n>0)
      {
        int t=n%10;
        int mul=1;
        for(int i=1;i<=c;i++)
        {
          mul=mul*t;
        }
        s=s+mul;
        n=n/10;
        
      }
     
      if(s==k)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}