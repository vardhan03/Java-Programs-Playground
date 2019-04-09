import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int c=sc.nextInt();
      switch(c)
      {
        case 1:int s=sc.nextInt();
          System.out.println(s*s);
          break;
        case 2:int l=sc.nextInt();
          int b=sc.nextInt();
          System.out.println(l*b);
          break;
        case 3:int ba=sc.nextInt();
          int h=sc.nextInt();
          System.out.println(((ba*h)/2));
          break;
        case 4:int r=sc.nextInt();
          double are=3.14*r*r;
          System.out.println(are);
          break;
      }
                             
    }
}