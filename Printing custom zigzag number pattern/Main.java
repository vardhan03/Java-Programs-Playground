import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(i%2==0)
          {
          	for(int k=0;k<n-1;k++)
            {
              System.out.print(i+1);
            }
            System.out.print(i+2);
            break;
          }
          else
          {
          	System.out.print(i+2);
            for(int t=1;t<n;t++)
            {
           		System.out.print(i+1);
            }
            break;
          }
        }
        System.out.println();
      }
      sc.close();
	}
}