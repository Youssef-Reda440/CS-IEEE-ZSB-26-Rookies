import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w;
        w = scanner.nextInt();

        if (w >= 1 && w <= 100){
            if (w > 2 && w % 2 == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}