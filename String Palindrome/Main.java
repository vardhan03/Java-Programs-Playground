import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
      	String s=sc.nextLine();
      StringBuilder sb=new StringBuilder(s);
      String rev=sb.reverse().toString();
      if(s.equals(rev))
        System.out.println("Yes");
      else
        System.out.println("No");
      	sc.close();
    } 
}