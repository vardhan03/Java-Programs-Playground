import java.util.Scanner;
import java.io.*;
/*class Main{
    public static void main(String args[])throws IOException
    {
     	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      	String str=br.readLine();
       	StringBuffer sb=new StringBuffer(str);
      	String str1=br.readLine();
      	sb.append(str1);
      	if(isSubstring(str,str1))
        {
          System.out.println("Yes");
        }
      	else
        {
          System.out.println("No");
        }
      	
    
    }
  	static Boolean isSubstring(String s1, String s2) 
    { 
        int M = s1.length(); 
        int N = s2.length(); 
      
        /* A loop to slide pat[] one by one 
        for (int i = 0; i <= N - M; i++) { 
            int j; 
      
            /* For current index i, check for 
            pattern match 
            for (j = 0; j < M; j++) 
                if (s2.charAt(i + j) != s1.charAt(j)) 
                    break; 
      
            if (j == M) 
                return true; 
        } 
      
        return false; 
    } 
}*/
  class Main
{ 
    /* Function checks if passed strings (str1 and str2) 
       are rotations of each other */
    static boolean areRotations(String str1, String str2) 
    { 
        // There lengths must be same and str2 must be  
        // a substring of str1 concatenated with str1.   
        return (str1.length() == str2.length()) && 
               ((str1 + str1).indexOf(str2) != -1); 
    } 
      
    // Driver method 
    public static void main (String[] args)throws IOException 
    { 
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine(); 
        String str2 = br.readLine(); 
  
        if (areRotations(str1, str2)) 
            System.out.println("Yes"); 
        else
            System.out.printf("No"); 
    } 
} 