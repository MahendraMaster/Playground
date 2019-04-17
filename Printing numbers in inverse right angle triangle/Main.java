import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in= new Scanner(System.in);
      int r = in.nextInt();
      int num = r;
      for (int row =1 ; row <= r; row++)
      {
        
        for(int col = num; col >= 1; col--)
        {
          
          System.out.print(col);
          
        }
          num = num -1;
        
         System.out.print("\n");
      }
	}
}