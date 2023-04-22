import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> ans = new HashSet<>();
        for (int i = 0; i < n + m; i++) {
            ans.add(sc.nextInt());
        }
        TreeSet<Integer> anss = new TreeSet<>(ans);
        for (int x : anss) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}