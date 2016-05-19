import java.io.*;
import java.util.*;

public class Solution {
   static String sort(String A){
       A = A.toUpperCase();
       char[] a = A.toCharArray();
       Arrays.sort(a);
       String ret = new String(a);
       return ret;
   }
    
   static boolean isAnagram(String A, String B) {
       return (sort(A).equals(sort(B)));
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
