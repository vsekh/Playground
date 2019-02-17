import java.util.Scanner;
class Main {
	public static void main (String[] args){
      
      int sum=0,n,t;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
     
      while(n>0)
      {
       
        t=n%10;
        sum=sum+t;
        n=n/10;
      }
      System.out.println(sum);
	    // Type your code here
	}
}