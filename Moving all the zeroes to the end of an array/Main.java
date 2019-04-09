import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int s=in.nextInt();
    int[] a=new int[s];
    for(int i=0;i<s;i++)
      a[i]=in.nextInt();
    int[] z=new int[s];
    int zs=0;
    int[] n=new int[s];
    int ns=0;
    for(int i=0;i<s;i++)
    {
      if(a[i]==0)
      {
        z[zs]=0;
      	zs++;
      }
      else
      {
        n[ns]=a[i];
        ns++;
      }
    }
    /*int j=0,k=0;
    for(int i=0;i<s;i++)
    {	
      while(j<ns)
      {
        a[i]=n[j];
        j++;
      }
     while(k<zs)
     {
       a[i]=z[k];
       k++;
     }
    }*/
    for(int i=0;i<ns;i++)
   System.out.print(n[i]+" ");
   for(int i=0;i<zs;i++)
     System.out.print(z[i]+" ");
  }
}
    
    
    