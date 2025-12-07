import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, a, b, c;

        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            if (a + b == c || a + c == b || b + c == a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();       
    }
}