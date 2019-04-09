import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int rem=0,q,i=0,rem1=0;
    if(n>100)
    {
      while(i<3)
    {
      rem=n%10;
       n=n/10;
      i++;
    }
     
    }
    q=n;
    rem1=q%10;
    
    System.out.println(rem1);
    

   
  }
}