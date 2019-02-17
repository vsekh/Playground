import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int n,count=0;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      for(int i=1;count<n;i++)
      {
        if(i%2==1)
        {
          System.out.println(i);
          count=count+1;
        }
      }
	     // Type your code here
	}
}