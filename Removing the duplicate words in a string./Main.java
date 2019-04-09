import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
   Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String[] w=s.split(" ");
    for(int i=0;i<w.length;i++)
    {
      if(w[i]!=null)
      {
        for(int j=i+1;j<w.length;j++)
        {
          if(w[i].equals(w[j]))
             {
               w[j]=null;
             }
         }
      }
    }
    for(int k=0;k<w.length;k++)
    {
      if(w[k]!=null)
      {
        System.out.print(w[k]+" ");
      }
    }
  }
 }