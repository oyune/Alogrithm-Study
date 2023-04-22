import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n; i++) {
            dp(1, i + " ");
        }
        System.out.println(result);
    }

    public static void dp(int count, String str) {
        if (count == m) {
            result.append(str);
            result.append("\n");
            return;
        }
        count++;
        for (int i = 1; i <= n; i++) {
            dp(count, str + i + " ");
        }
    }
}