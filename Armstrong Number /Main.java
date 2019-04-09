import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int rem,sum=0;
      int b=n;
      while(n>0)
      {
        rem=n%10;
        sum=sum+(rem*rem*rem);
        n=n/10;
	  }
      if(b==sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
}
} 