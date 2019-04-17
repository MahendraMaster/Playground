import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
      int result = gotn(n1,n2);
      System.out.println(gotn(result,n3));
    }
      public static int gotn(int a,int b)
      {
        int g;
      if (a>b)
        g = a;
        else 
          g=b;
        return g;
      }
	}