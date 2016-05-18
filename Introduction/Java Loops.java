import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a, b, n;
        float sum;
        for(int i=0;i<t;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            n=sc.nextInt();
            sum=a;
            for(int j=0; j<n; j++){
                sum += Math.pow(2,j)*b;
                System.out.printf("%.0f ", sum);
            }
            System.out.printf("%n");
        }
    }
}
