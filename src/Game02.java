import java.util.Scanner;

public class Game02 {
        static int number = 50;
        static int max = 100;
        static int min = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Your number is bigger then " + number + "?");
            String q = sc.nextLine();
            if (q.equals("b")) {
                min = number;
                number = (int) (number + ((number/100.0f) * 15));
            }
            if (q.equals("l")) {
                max = number;
                number = (int) (number - ((number / 100.0f) * 15));
            }
            if (q.equals("y")) {
                System.out.println("Finally i got it");
                break;
            }
        }
    }
}
