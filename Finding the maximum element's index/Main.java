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
    int max=a[0];
    int t=0;
    for(int i=1;i<n;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
        t=i;
      }
    }
    System.out.print(t);
  }
}