import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int rating = 0;
        
        if (t >= 1 && t<= 10000){
            for (int i = 0; i < t; i++){
                rating = scanner.nextInt();
                if (rating >= -5000 && rating <= 5000){
                    if (rating >= 1900)  
                        System.out.println("Division 1");
                    else if (rating >= 1600)
                        System.out.println("Division 2");
                    else if (rating >= 1400)
                        System.out.println("Division 3");
                    else 
                        System.out.println("Division 4");               
                }
            }
        }
        scanner.close();
       
    }
}