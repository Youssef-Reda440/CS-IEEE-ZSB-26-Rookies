import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();

            int[] freqS = new int[26];
            int[] freqT = new int[26];

            for (int i = 0; i < n; i++) {
                freqS[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < n; i++) {
                freqT[t.charAt(i) - 'a']++;
            }

            boolean same = true;

            for (int i = 0; i < 26; i++) {
                if (freqS[i] != freqT[i]) {
                    same = false;
                    break;
                }
            }

            if (same) 
                System.out.println("YES");
            else 
                System.out.println("NO");
        }

        sc.close();
    }
}
