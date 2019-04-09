import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner sc=new Scanner(System.in);
      	String s=sc.nextLine();
      	StringBuilder sb=new StringBuilder(s);
      	String[] ss=s.split(" ");
      	for(int i=ss.length-1;i>=0;i--)
        {
          System.out.print(ss[i]+" ");
        }
          
      	sc.close();
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
      
    }
}