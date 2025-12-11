import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s;
        if (n >= 1 && n <= 100){
            for (int i = 0; i < n; i++) {
                s = scanner.next();
                if (s.length() > 10) {
                    System.out.println(s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1));
                } else {
                    System.out.println(s);
                }
            
            }
        }
        scanner.close();
    }
}