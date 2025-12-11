import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine(); 
        String s = sc.nextLine();
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            seen[c - 'a'] = true;
        }
     
        boolean pangram = true;
        for (int i = 0; i < 26; i++) {
            if (!seen[i]) {
                pangram = false;
                break;
            }
        }

        if (pangram) 
            System.out.println("YES");
        else 
            System.out.println("NO");

        sc.close();
    }
}
