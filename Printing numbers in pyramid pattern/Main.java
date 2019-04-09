import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k,j=1;
      for(int i=1;i<=n;i++)
      {
        for(int l=0;l<n-i;l++)
          System.out.print(" ");
        for(k=0;k<i;j++,k++)
        {
          System.out.print(j+" ");
        }
        System.out.println();
      }
    }    
}