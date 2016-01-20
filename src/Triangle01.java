public class Triangle01 {
    public static void main(String[] args) {
        int count = 4;
        //--------------------------------
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //--------------------------------
        System.out.println();

        for (int i = count; i > 0; i--) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //--------------------------------
        System.out.println();
        for (int i = count; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = count; j > i - 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        //--------------------------------
        System.out.println();

        for (int i = 0; i < count; i++) {
            for (int j = count; j > i; j--) {
                if (j == count - i || i == 0) {
                    System.out.print("*");
                } else System.out.print("-");
            }
            System.out.println();
        }
//        for (int i = 0; i < count; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = count; j > i ; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
