import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    
   int arr[]= new int[n];
    
    for(int i=0; i<n; i++)  
    {
    arr[i]= in.nextInt();
    }
    int x =0;
    for(int i=0; i<n; i++)
    {
     if (arr[i] > x)
     {
        x = arr[i];
     }
    }
    System.out.println(x);
  }
}