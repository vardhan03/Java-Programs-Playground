import java.util.Scanner;
class Main
{
  public static void is_pbatch(int l[],int n)
  {
    int pb=1;
    int cs;
    int bs=l[0]+l[1]+l[2];
    for(int i=3;i<n;i=i+3)
    {
      
      cs=l[i]+l[i+1]+l[i+2];
      if(cs!=bs)
      {
        pb=0;
        break;
      }
    }
    if(pb==1)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int l[]=new int[n];
    for(int i=0;i<n;i++)
      l[i]=in.nextInt();
    is_pbatch(l,n);
  }
  
}