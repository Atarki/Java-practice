import java.util.Arrays;
import java.util.Random;

public class TaskAll {
    public static void main(String[] args) {
        double number = 28.13534745736483d;

        int[] massiveOne = new int[100];
        int[][] massiveDouble = new int[5][3];


        String[] stringArray = new String[]{"Jon", "Jonatan", "Jonny", "Jerad", "Lajonio", "Junior"};
        String[] stringArray2 = new String[]{"утка", "утканос", "лодка", "лопатка", "гутка", "хрютка", "закрутка"};
        String[] stringArray3 = new String[]{"Jon", "Jon", "Jon", "Jon", "Jon", "Jon"};

        char[] chars = new char[]{'j', 'c', 'o', 'n', 'r', 't', 'i', 'j', 'o', 'n'};
        char[] chars2 = new char[]{'j', 'o', 'n'};

        Random random = new Random();


        for (int i = 0; i < massiveDouble.length; i++) {
            for (int j = 0; j < massiveDouble[i].length; j++) {
                massiveDouble[i][j] = random.nextInt(30);
            }
        }

        for (int i = 0; i < massiveOne.length; i++) {
            massiveOne[i] = random.nextInt(100);
        }

        //-----------------------------test methodes-----------------------
//        System.out.println(isYearIsBig(2024));

        print(number);
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(contains(stringArray, "Jon")));
        System.out.println(Arrays.toString(contains(stringArray2, "утка")));
        System.out.println(Arrays.toString(contains(stringArray3, "Jon")));
//        System.out.println(isDuplicates(new byte[]{22, 23, 21, 2, 22}));

//        System.out.println(Arrays.toString(massiveOne));
//        System.out.println(Arrays.toString(sort(massiveOne, true)));
//        invert(massiveDouble);

//        System.out.println(Arrays.toString(convert(new int[][]{{65, 66, 68}, {72, 70, 75},})));
//        print((convert(new int[][]{{65, 66, 68}, {72, 70, 75}})));
//        System.out.println(Arrays.deepToString(intToChar(massiveDouble)));
        System.out.println(contains(chars, chars2));


    }

    //task01
    public static void print(char[][] array) {
        for (char[] chars : array) {
            for (char aChar : chars) {
                System.out.println(aChar);
            }
        }
    }

    public void print(char[] array) {
        for (char c : array) {
            System.out.println(c);
        }
    }

    //task02
    public static void print(String[][] array) {
        for (String[] innerArray : array) {
            for (String s : innerArray) {
                System.out.print(s);
            }
            System.out.println();
        }
    }

    //task03
    public static char[][] convert(int[][] array) {
        char[][] newArray = new char[array.length][];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = new char[array[i].length];
            for (int j = 0; j < array[i].length; j++) {
                newArray[i][j] = (char) array[i][j];
            }
        }
        return newArray;
    }

    //task04
    public static int[][] invert(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] *= -1;
            }
        }
        return array;
    }

    //task05
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    //task06
    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    //task07
    public static int max(int a, int b, int c, int d, int e) {
        return max(max(a, b, c), max(d, e));
    }

    //task08
    public static String toString(char[] array) {
        return String.valueOf(array);
    }

    //task09
    public static boolean contains(char[] array, char[] charsToFind) {
        String stringOriginal = new String(array);
        String find = new String(charsToFind);
        if (stringOriginal.indexOf(find) != -1) {
            return true;
        }
        return false;
    }

    //task10
    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    //task11
    public static int lastIndexOf(int[] array, int value) {
        for (int i = array.length - 1; i > 0; i--) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    //task12
    public static int factorial(int integer) {
        int result = 1;
        for (int i = 1; i <= integer; i++) {
            result *= i;
        }
        return result;
    }

    //task13
    public static boolean isYearIsBig(int yearNumber) {
        return yearNumber % 400 == 0 || yearNumber % 4 == 0 || yearNumber % 100 != 0;
    }

    //task14
    public static String[] contains(String[] strings, String text) {
        int count = 0;
        int filled = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].indexOf(text) != -1) count++;
        }
        String[] sorted = new String[count];

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].indexOf(text) != -1) {
                sorted[filled] = strings[i];
                filled++;
            }
        }
        return sorted;
    }

    //task15
    public static void divide(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % value == 0) {
                System.out.println(array[i]);
            }
        }
    }

    //task16
    public static void print(double number) {
        System.out.printf("%.3f", number);
    }

    //task17
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    //task18
    public static int[] sortDecrease(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    //task19
    public static int[] sort(int[] array, boolean b) {
        return b ? sortDecrease(array) : sort(array);
    }

    //task20
    public static boolean isDuplicates(byte[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) return true;
            }
        }
        return false;
    }
}
