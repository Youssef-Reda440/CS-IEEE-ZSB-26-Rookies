import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int r = scanner.nextInt();

        int n = 1;
        while (true) {
            int total = k * n;
            if (total % 10 == 0 || total % 10 == r) {
                System.out.println(n);
                break;
            }
            n++;
        }

        scanner.close();
    }
}

