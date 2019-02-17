import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[20];
        for(int i=0;i<n;i++)
        {
          a[i]=in.nextInt();
        }
        int r=in.nextInt();
        int k,t;
        if(n%2==0)
          k=n-2;
        else 
          k=n-1;
        for(int i=0;i<r;i++)
        {
           t=a[k];
          for(int j=k-2;j>=0;j=j-2)
          {
            a[j+2]=a[j];
          }
          a[0]=t;
          
        }
        if(n%2==0)
          k=n-1;
        else 
          k=n-2;
        for(int i=0;i<r;i++)
        {
           t=a[1];
          for(int j=3;j<=k;j=j+2)
          {
            a[j-2]=a[j];
          }
          a[k]=t;
        }
        for(int i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }
    
  	}
}