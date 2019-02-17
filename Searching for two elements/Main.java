import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int e1,e2,t1=-1,t2=-1;
      e1=in.nextInt();
      e2=in.nextInt();
      for(int i=0;i<n;i++)
      {
        if(e1==a[i])
        {
          t1=i;
        }
        if(e2==a[i])
        {
          t2=i;
        }
      }
      System.out.println(t1);
      System.out.println(t2);
      
    }
}