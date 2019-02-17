import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int sec_dig=0;
      int first_dig=0,n;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      
      while(n>0)
      {
        sec_dig=first_dig;
        first_dig=n%10;
        n=n/10;
      }
      System.out.println(sec_dig);
	    // Type your code here
	}
}