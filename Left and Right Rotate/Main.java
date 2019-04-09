import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int s=in.nextInt();
        int[] a=new int[100];
        for(int i=1;i<=s;i++)
            a[i]=in.nextInt();
        int rn=in.nextInt();
        int[] e=new int[50];
        int es=1;
        int[] o=new int[50];
        int os=1;
        for(int i=1;i<=s;i++)
        {
            if(a[i]%2!=0)
            {
                o[os]=a[i];
               // System.out.print(o[os]+" ");
                os++;
            }
            else
            {
                e[es]=a[i];
                //System.out.println(e[es]+" ");
                es++;
            }
        }
        
        //System.out.println(es+" "+os);
        for(int i=1;i<=rn;i++)
        {  
            int temp=e[1];
            for(int j=2;j<es;j++)
            {
                e[j-1]=e[j];
                //System.out.print(e[j-1]+" ");
            }
            e[es-1]=temp;
            //System.out.println(e[es-1]);
        }
         for(int i=1;i<=rn;i++)
        {   
            int temp=o[os-1];
            for(int j=os;j>1;j--)
            {
                o[j-1]=o[j-2];
            }
            o[1]=temp;
        }
        int k=1,l=1;
        for(int m=1;m<=s;m++)
        {
            if(m%2!=0)
            {
                a[m]=o[k];
                k++;
            }
            else
            {
                a[m]=e[l];
                l++;
            }
        }
        for(int i=1;i<=s;i++)
                System.out.print(a[i]+" ");
  
    }
}