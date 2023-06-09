import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                deque.add(num);
            } else if (str.equals("pop")) {
                if (deque.isEmpty()) sb.append(-1 + "\n");
                else sb.append(deque.poll() + "\n");
            } else if (str.equals("size")) sb.append(deque.size() + "\n");
            else if (str.equals("empty")) {
                if (deque.size() == 0) sb.append(1 + "\n");
                else sb.append(0 + "\n");
            } else if (str.equals("front")) {
                if (deque.size()==0) sb.append(-1 + "\n");
                else sb.append(deque.peekFirst() + "\n");
            }else if (str.equals("back")){
                if (deque.size()==0) sb.append(-1 + "\n");
                else sb.append(deque.peekLast() + "\n");
            }
        }
        System.out.println(sb);
    }
}
