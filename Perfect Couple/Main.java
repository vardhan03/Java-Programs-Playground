import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int s=in.nextInt();
      int[] a=new int[s];
      for(int i=0;i<s;i++)
        a[i]=in.nextInt();
      int val=in.nextInt();
      for(int i=0;i<s;i++)
      {
        for(int j=i+1;j<s;j++)
        {
        if(a[i]+a[j]==val)
        {
          System.out.println(a[i]+","+" "+a[j]);
        }
        }
      }
    }
}