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
    int k=0;
    int t=a[0]+a[1]+a[2];
    for(int i=3;i<n;i=i+3)
    {
      if(a[i]+a[i+1]+a[i+2]==t)
        k=1;
      else
      {
        k=0;
        break;
      }
    }
    if(k==1)
      System.out.print("Perfect Batch");
    else if(k==0)
      System.out.print("Not a Perfect Batch");
    
  }
}