import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++){
            int d = sc.nextInt();
            ArrayList<Integer> subarr = new ArrayList<Integer>();
            for(int y = 0; y < d; y++){
                subarr.add(sc.nextInt());
            }
            arr.add(subarr);
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if (x < n && y < arr.get(x).size()){
                System.out.println(arr.get(x).get(y));
            }
            else{
                System.out.println("ERROR!");
            }
        }
    }
}