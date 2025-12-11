import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t >= 1 && t <= 100) {

            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                if (n >= 3 && n <= 100) {
                    int[] arr = new int[n];
                    for (int j = 0; j < n; j++) {
                        arr[j] = scanner.nextInt();
                    }
                  
                    int test;
                    if (arr[0] == arr[1]) 
                        test = arr[0];
                    else if (arr[0] == arr[2]) 
                        test = arr[0];
                    else 
                        test = arr[1];
                    
                    int index = -1;
                    for (int j = 0; j < n; j++) {
                        if (arr[j] != test) {
                            index = j + 1; 
                            break;
                        }
                    }
                    System.out.println(index);
                }
            }
        }

        scanner.close();
    }
}
