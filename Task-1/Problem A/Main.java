import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, count = 0;
        n = scanner.nextInt();
        int [][] arr = new int[n][3];

        if (n >= 1 && n <= 1000) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = scanner.nextInt();
                }
                System.out.println();
            }

            for (int i = 0; i < n; i++) {
                if (arr[i][0] + arr[i][1] + arr[i][2] >= 2) 
                    count++;                            
            }   
            System.out.println(count);              
        } 
        scanner.close();
    }
}