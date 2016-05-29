    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int max = 0;
            int current = 0;
            Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
               int num = in.nextInt();
               
                deque.add(num);
                if (frequency.containsKey(num)){
                    frequency.put(num,frequency.get(num)+1);
                } else {
                    frequency.put(num,1);
                    current++;
                }
                if (deque.size()==m+1){
                    int removed = (int) deque.remove();
                    frequency.put(removed,frequency.get(removed)-1);
                    if (frequency.get(removed)==0){
                        current--;
                    }
                }
                if (current>max) {
                    max = current;
                }
            }
            
            System.out.println(max);
        }
    }