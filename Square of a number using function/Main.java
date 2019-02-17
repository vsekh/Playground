import java.util.Scanner;
class Main
{
  public static int sqr(int n)
  {
    return n*n;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=sqr(n);
      System.out.print(s);
	} 
}