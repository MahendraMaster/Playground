import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    
    for (int row= 1; row <= r; row ++)
    {
       for (int col= 1; col <= r; col ++)
       {
         
         System.out.print(row);

       }
      System.out.print("\n");
	}
	}
}