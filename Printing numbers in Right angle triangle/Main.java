import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=1;
      for(int i=0;i<n;i++)
      {
        	for(int j=0;j<=i;j++)
            {
              	System.out.print(c);
            }
        	c++;
        System.out.println();
      }
	}
}