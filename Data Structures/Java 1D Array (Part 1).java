import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        int local;
        for(int i=0; i < n; i++){
            local=0;
            for(int j=i; j < n; j++){
                local+=arr[j];
                if(local < 0){
                    c+=1;
                }
            }  
        }
        System.out.println(c);
    }
}