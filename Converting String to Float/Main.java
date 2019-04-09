import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int len=s.length();
    double ad=0;
    double bd=0;
    int flag=0;
    for(int i=0;i<len;i++)
    {
      if(s.charAt(i)=='.')
        flag=1;
    }
    if(flag==1)
    {
      for(int i=len-1;s.charAt(i)!='.'&&i>=0;i--)
      {
        ad=ad/10+(s.charAt(i)-'0');
      }
      ad/=10;
      for(int i=0;s.charAt(i)!='.';i++)
      {
        bd=bd*10+(s.charAt(i)-'0');
      }
    }
    else
    {
      for(int i=0;i<len;i++)
      {
        bd=bd*10+(s.charAt(i)-'0');
      }
    }
    double sum=(ad+bd);
    System.out.println(sum);
  }
}