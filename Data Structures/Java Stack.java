import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
         Stack S = new Stack();
         String input=sc.next();
         boolean balance = true;
         S.push(Character.toString(input.charAt(0)));
         int pos = 1;
         while(balance == true && pos < input.length()){
            String look = Character.toString(input.charAt(pos));
            if (S.empty() || look.equals("(") || look.equals("{") || look.equals("[")) S.push(look);
            else{
                if(matcher(look).equals(S.peek())) S.pop();
                else balance = false;
            }
            pos++;
         }
         if(balance == true && S.empty()) System.out.println(balance);
         else System.out.println(false);
      }
   }
   public static String matcher(String bracket){
       if(bracket.equals("}")) return "{";
       else if(bracket.equals(")")) return "(";
       else if(bracket.equals("]")) return "[";
       else return "None";
   }
}
