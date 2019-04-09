import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int c=1;c<=n;c++)
      {
        if(c%2==1)
        {System.out.println(c);
        }
      }
	}
}