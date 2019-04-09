import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      int p=sc.nextInt();
      String s3=s1.replace(s1,s2);
      String f[]=s3.split(" ",p);
      for(String r:f)
        System.out.println(r);
    }
}