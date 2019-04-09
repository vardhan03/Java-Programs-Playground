import java.util.*;
public class Main
{
  public static void power(int a,int b)
  {
    int p=1;
    for(int i=0;i<b;i++)
    {
      p=p*a;
    }
    System.out.println(p);
  }
  public static void main(String[] ss)
  {
 	Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    power(a,b);
    sc.close();
  }
}