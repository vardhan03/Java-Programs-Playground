import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    String s,f;
    Scanner sc=new Scanner(System.in);
    s=sc.nextLine();
    f=remv(s);
    System.out.println(f);
  }
  public static String remv(String s)
  {
    String f="";
    int i;
    for(i=0;i<s.length();i++)
    {
      if(!isv(Character.toLowerCase(s.charAt(i))))
      {
        f=f+s.charAt(i);
      }
    }
    return f;
  }
  public static boolean isv(char ch)
  {
    String v="aeiou";
    int i;
    for(i=0;i<5;i++)
    {
      if(ch==v.charAt(i))
      {
        return true;
      }
    }
    return false;
  }
 }