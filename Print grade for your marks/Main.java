import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=0;
      if(n>=85)
        k=1;
      else if(n<85 && n>=75)
        k=2;
      else if(n<75 && n>=65)
        k=3;
      else if(n<65 && n>=55)
        k=4;
      else if(n<55 && n>=45)
        k=5;
      switch(k)
      {
          case 1:System.out.println("A");break;
          case 2:System.out.println("B");break;
          case 3:System.out.println("C");break;
          case 4:System.out.println("D");break;
          case 5:System.out.println("E");break;
          default:System.out.println("Fail");break;
      }
    }
}