import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      for(int i=0;i<n;i++)
      {
        for(int k=1;k<n-i;k++)
          System.out.print(" ");
        for(int j=0;j<2*i+1;j++)
          System.out.print("*");
        System.out.print("\n");
      }
	}
}