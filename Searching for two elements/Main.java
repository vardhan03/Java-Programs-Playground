import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int s1=sc.nextInt();
      int s2=sc.nextInt();
      int p=0;
      int flag1=0;
      int flag2=0;
      int q=0;
      for(int i=0;i<n;i++)
      {
        if(s1==a[i] && flag1==0)
        {
          p=i;
          flag1=1;
        }
        if(s2==a[i] && flag2==0)
        {
          q=i;
          flag2=1;
        }
        
      }
       if(flag1==1)
         System.out.println(p);
      else
        System.out.println(-1);
    	 if(flag2==1)
         System.out.println(q);
      else
        System.out.println(-1);
    
    }
}