import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (isuppercase(s) || allExceptFirstUpper(s)) {
           
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isUpperCase(c))
                    result.append(Character.toLowerCase(c));
                else
                    result.append(Character.toUpperCase(c));
            }
            System.out.println(result);
        } else {
            System.out.println(s);
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

    public static boolean allExceptFirstUpper(String s){
        for (int i = 1; i < s.length(); i++) {
            if (!Character.isUpperCase(s.charAt(i)))
                return false;
        }
        return true;
    }
}
