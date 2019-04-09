import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int x=1;
      for(int i=0;i<n;i++)
      {
			for(int j=0;j<n;j++)
            {
              		System.out.print(x);
            }
        	x++;
        System.out.println("");
      }
	}
}