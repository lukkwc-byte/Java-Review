//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Map book = new HashMap();
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         book.put(name, phone);
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         String num;
         if(book.get(s) != null){
             num = String.valueOf(book.get(s));
             System.out.printf("%s=%s%n", s, num);
         }
         else{
             System.out.println("Not found");
         }
         
      }
   }
}
