import java.util.Scanner;
class Main
{
  public static int rep(int a[],int n,int f[])
  {
    int c=1,m=0;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i]==a[j])
        c++;
      }
      f[i]=c;
      c=1;
    }
    for(int i=0;i<n;i++)
    {
      if(f[i]>f[m])
      {
        m=i;
      }
      
    }
    return a[m];
  }
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
    int[] f=new int[n];
    System.out.println(rep(a,n,f));
  }
}