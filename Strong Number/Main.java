import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int fact,rem,sum=0;
      int b=n;
     /* int factorial(int a)
      {
        int f=1;
        for(int i=1;i<=a;i++)
        {
          f=f*i;
        }
        return f;
      }*/
      while(n>0)
      {
        rem=n%10;
         fact=1;
        for(int j=1;j<=rem;j++)
        {fact=fact*j;}
        sum=sum+fact;
        n=n/10;
      }
      if(sum==b)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}