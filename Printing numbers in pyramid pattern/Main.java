import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in= new Scanner(System.in);
      int r = in.nextInt();
      int num = 0;
      for (int row =1 ; row <= r; row++)
      {
        for(int space = 1 ; space <= (r-row); space++)
        {
          System.out.print(" ");
          
        }
        for(int col = 1; col <= row ; col++)
        {
          num =   num +1;
          System.out.print(num+" ");
        }
         System.out.print("\n");
      }
	}
}