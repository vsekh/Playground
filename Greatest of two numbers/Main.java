import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int n1,n2;
      Scanner in=new Scanner(System.in);
      n1=in.nextInt();
      n2=in.nextInt();
      if(n1>n2)
        System.out.println("num1 is the greatest number");
      else
        System.out.println("num2 is the greatest number");
	}
}