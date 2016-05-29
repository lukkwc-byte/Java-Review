import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }

        Arrays.sort( s, (as,bs) -> {BigDecimal bd = new BigDecimal(bs); 
        return bd.compareTo(new BigDecimal(as));} );
      
      
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }


}
