import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in= new Scanner(System.in);
      int r = in.nextInt();
      for (int row =1 ; row <= r; row++)
      {
        for(int space = 1 ; space <= (r-row); space++)
        {
          System.out.print(" ");
          
        }
        for(int col = 1; col <= (2*row-1); col++)
        {
          System.out.print("*");
        }
         System.out.print("\n");
      }
	}
}