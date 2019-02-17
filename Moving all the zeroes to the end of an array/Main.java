import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[20];
      int b[]=new int[20];
      int c=0,j=0;
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        if(a[i]==0)
          c=c+1;
        else
        {
         b[j]=a[i];
          j=j+1;
        }
      }
      for(int i=0;i<j;i++)
      {
        a[i]=b[i];
      }
      int i;
      for(i=j;i<n;i++)
      {
        a[i]=0;
      }
      for(i=0;i<n;i++)
      {
        System.out.print(a[i]+" ");
      }
      
    }
}