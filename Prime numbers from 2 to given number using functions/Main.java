import java.util.Scanner;
class Main{
  public static void prime(int n)
  {
    for(int i=2;i<n;i++)
    {
      int count=0;
      for(int j=1;j<=n;j++)
      {
        if(i%j==0)
        {
          count++;
        }
      }
      if(count==2)
      {
        System.out.println(i);
      }
    }
  }
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      prime(n);
      sc.close();
	}
}