import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();

            while (s.length() != n || !isuppercase(s)){
                s = scanner.nextLine();
            }

            boolean[] solved = new boolean[26];  
            int balloons = 0;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                int index = c - 'A';

                if (!solved[index]) {
                  
                    balloons += 2;
                    solved[index] = true; 
                } else {
                   
                    balloons += 1;
                }
            }

            System.out.println(balloons);
            
        }
        scanner.close();
    }

    public static boolean isuppercase(String s){
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isUpperCase(s.charAt(i)))
                return false;                 
        }
        return true;
    }
    
}