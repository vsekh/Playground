import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int p=n,f,s=0;
      while(p>0)
      {
        int k=p%10;
        if(k==0)
          f=1;
        else
        {
          f=1;
          for(int i=1;i<=k;i++)
          {
            f=f*i;
          }
        }
        s=s+f;
        p=p/10;
      }
      if(s==n)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}