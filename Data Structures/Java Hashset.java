import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        HashSet<String> H = new HashSet<String>();
        for(int i = 0; i < T; i++){
            H.add(sc.nextLine());
            System.out.println(H.size()); 
        }    
    }
}