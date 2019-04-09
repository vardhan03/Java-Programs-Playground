import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println(maxs(a,n));
  }
  public static int maxs(int a[],int n)
  {
    int rs=a[0],ms=a[0];
    for(int i=1;i<n;i++)
    {
      if(a[i]>a[i-1])
      {
        rs+=a[i];
      }
      else
      {
        rs=a[i];
      }
      if(rs>ms)
      {
        ms=rs;
      }
    }
      return ms;
  }
}