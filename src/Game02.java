import java.util.Scanner;

public class Game02 {
        static int number = 50;
        static int max = 100;
        static int min = 0;
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please propose a number....And print b-bigger, l- lower");
        Thread.currentThread().sleep(4000);
        System.out.println("Ok lets go.");
        Thread.currentThread().sleep(1000);

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
