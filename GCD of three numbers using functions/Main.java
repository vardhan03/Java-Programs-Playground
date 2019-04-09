import java.util.Scanner;
public class Main{
public static int gcd(int n1,int n2)
{
  int x=0;
  for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
                x = i;
        }
  return x;
}
  public static void main (String[] args)
	{
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
	    int t=gcd(n1,n2);
    System.out.println(gcd(t,n2));

	}
}