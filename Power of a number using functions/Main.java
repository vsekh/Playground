import java.util.Scanner;
class Main
{
  public static int power(int a,int b)
  {
    int mul=1;
    for(int i=1;i<=b;i++)
    {
      mul=mul*a;
    }
    return mul;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int s=power(a,b);
      System.out.println(s);
  }
}