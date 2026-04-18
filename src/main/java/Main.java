import javax.xml.transform.Source;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
//        //1
//        System.out.println(" \"Your time is limited,\n\tso don’t waste it \n\t\tliving someone else’s life\"\n\t\t\tSteve Jobs");
//
//        //2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number1 = scanner.nextInt();
//        System.out.println("Enter another number: ");
//        int number2 = scanner.nextInt();
//
//        System.out.println("The result is " + (number1 * number2 / 100.0));
//
//        //3
//        System.out.println("Enter a number: ");
//        number1 = scanner.nextInt();
//        System.out.println("Enter another number: ");
//        number2 = scanner.nextInt();
//        System.out.println("Enter another number: ");
//        int number3 = scanner.nextInt();
//
//        System.out.println("The result is " + (number1*100 + number2*10 + number3));

        //4
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введіть шестизначне число: ");
//        String input = scanner.nextLine();
//
//        if (input.length() != 6 || !input.matches("\\d{6}")) {
//            System.out.println("Помилка: потрібно ввести шестизначне число!");
//            return;
//        }
//
//        char[] digits = input.toCharArray();
//
//        char temp = digits[0];
//        digits[0] = digits[5];
//        digits[5] = temp;
//
//        temp = digits[1];
//        digits[1] = digits[4];
//        digits[4] = temp;
//
//        String result = new String(digits);
//        System.out.println("Результат: " + result);

        //5
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введіть номер місяця: ");
//        int month = sc.nextInt();
//
//        if (month < 1 || month > 12) {
//            System.out.println("Помилка!");
//        } else if (month == 12 || month == 1 || month == 2) {
//            System.out.println("Winter");
//        } else if (month >= 3 && month <= 5) {
//            System.out.println("Spring");
//        } else if (month >= 6 && month <= 8) {
//            System.out.println("Summer");
//        } else {
//            System.out.println("Autumn");
//        }

        //6
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Введіть метри: ");
//        double meters = sc.nextDouble();
//
//        System.out.println("1 - милі, 2 - дюйми, 3 - ярди");
//        int choice = sc.nextInt();
//
//        switch (choice) {
//            case 1:
//                System.out.println("Милі: " + (meters * 0.000621371));
//                break;
//            case 2:
//                System.out.println("Дюйми: " + (meters * 39.3701));
//                break;
//            case 3:
//                System.out.println("Ярди: " + (meters * 1.09361));
//                break;
//            default:
//                System.out.println("Помилка!");
//        }

        //7
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if (a > b) {
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//
//        for (int i = a; i <= b; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//        }

//8
//        Scanner sc = new Scanner(System.in);
//
//        int start = sc.nextInt();
//        int end = sc.nextInt();
//
//        if (start > end) {
//            int temp = start;
//            start = end;
//            end = temp;
//        }
//
//        for (int i = start; i <= end; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
//            }
//            System.out.println();
//        }

//9
//        int[] arr = new int[20];
//        Random rand = new Random();
//
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        int positive = 0, negative = 0, zeros = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rand.nextInt(21) - 10;
//
//            if (arr[i] < min) min = arr[i];
//            if (arr[i] > max) max = arr[i];
//
//            if (arr[i] > 0) positive++;
//            else if (arr[i] < 0) negative++;
//            else zeros++;
//        }
//
//        System.out.println("Min: " + min);
//        System.out.println("Max: " + max);
//        System.out.println("Positive: " + positive);
//        System.out.println("Negative: " + negative);
//        System.out.println("Zeros: " + zeros);
//

        //10
//        int[] arr = new int[20];
//        Random rand = new Random();
//
//        List<Integer> even = new ArrayList<>();
//        List<Integer> odd = new ArrayList<>();
//        List<Integer> positive = new ArrayList<>();
//        List<Integer> negative = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rand.nextInt(21) - 10;
//
//            if (arr[i] % 2 == 0) even.add(arr[i]);
//            else odd.add(arr[i]);
//
//            if (arr[i] > 0) positive.add(arr[i]);
//            else if (arr[i] < 0) negative.add(arr[i]);
//        }
//
//        System.out.println("Even: " + even);
//        System.out.println("Odd: " + odd);
//        System.out.println("Positive: " + positive);
//        System.out.println("Negative: " + negative);

        //11
//
//        public static void drawLine(int length, boolean horizontal, char symbol) {
//            if (horizontal) {
//                for (int i = 0; i < length; i++) {
//                    System.out.print(symbol);
//                }
//            } else {
//                for (int i = 0; i < length; i++) {
//                    System.out.println(symbol);
//                }
//            }
//        }


        //12
//        public static void sort(int[] arr, boolean ascending) {
//            Arrays.sort(arr);
//
//            if (!ascending) {
//                for (int i = 0; i < arr.length / 2; i++) {
//                    int temp = arr[i];
//                    arr[i] = arr[arr.length - 1 - i];
//                    arr[arr.length - 1 - i] = temp;
//                }
//            }
//        }

    }
}
