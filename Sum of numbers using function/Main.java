import java.util.Scanner;
class Main
{
   public static int sum_of_numbers(int m)
   {
      int sum = ((m*(m+1))/2);
    
      return sum;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
    int s = sum_of_numbers(n);
     System.out.println(s); 
   }
}
