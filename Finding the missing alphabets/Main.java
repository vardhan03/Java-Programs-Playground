import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine().toLowerCase();
      StringBuilder ss=new StringBuilder("abcdefghijklmnopqruvstwxyz");
      StringBuilder sb=new StringBuilder(s);
      int[] a=new int[26];
      int j=0;
      for(int i=0;i<s.length();i++)
      {
        if(sb.charAt(i)==' ')
          continue;
        int t=sb.charAt(i)-'a';
        a[t]=1;
      }
      for(int i=0;i<26;i++)
      {
        if(a[i]==0)
        System.out.print(ss.charAt(i)+" ");
      }
      sc.close();
    }
}