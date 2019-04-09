import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0;
      sum+=n%10;
      while(n>10)
        n=n/10;
      sum+=n%10;
      System.out.println(sum);
	}
}