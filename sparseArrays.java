import java.util.*;

public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int i = 0;
        while(i < N){
            String s = sc.next();
            if(map.containsKey(s)){
                int c = map.get(s);
                c++;
                map.put(s,c);
                i++;
                continue;
            }
            map.put(s, 1);
            i++;
        }
        int Q = sc.nextInt();
        int j = 0;
        while(j < Q){
            String q = sc.next();

            if(map.containsKey(q)){
                System.out.println(map.get(q));
            }
            else{
                System.out.println("0");
            }
            j++;
        }
        return;
    }