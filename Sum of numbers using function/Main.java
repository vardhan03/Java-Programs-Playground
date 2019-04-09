import java.util.Scanner;
class Main{
  public static int Sum(int n)
  {
    int s=0;
    for(int i=1;i<=n;i++)
    {
      s=s+i;
    }
    return s;
  }
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(Sum(n));
	}
}