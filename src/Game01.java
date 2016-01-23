import java.util.Random;
import java.util.Scanner;
public class Game01 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("Enter your number to win...");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int keyboard = sc.nextInt();
            if (number < keyboard) {
                System.out.printf("Lower");
            } else System.out.println("Bigger");
            if (number == keyboard) {
                System.out.println("Known !!!");
                break;
            }
        }
    }
}
