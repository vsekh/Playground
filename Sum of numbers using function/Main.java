import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    return (n*(n+1)/2);
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=sum(n);
      System.out.print(s);
	}
}