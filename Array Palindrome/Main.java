import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int[] a=new int[n];
      	for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
      	int b[]=new int[n];
      for(int i=0,j=n-1;j>=0;i++,j--)
        b[i]=a[j];
      if(Arrays.equals(a,b))
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      	sc.close();
    }
}