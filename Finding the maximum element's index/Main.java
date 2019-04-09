import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int l[]=new int[n];
    for(int i=0;i<n;i++)
      l[i]=in.nextInt();
    highest_element_index(l,n);
  }
  public static void highest_element_index(int l[],int n)
  {
    int hi=0,he=l[0];
    for(int i=0;i<n;i++)
    {
      if(l[i]>he)
      {
        he=l[i];
        hi=i;
      }
    }
    System.out.println(hi);
  }
}