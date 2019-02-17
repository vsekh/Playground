import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int last_dig;
      int first_dig=0,n;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      last_dig=n%10;
      while(n>0)
      {
        
        first_dig=n;
        n=n/10;
      }
      System.out.println(last_dig+first_dig);
	    // Type your code here
	}
}