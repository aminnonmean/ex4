package pack;

import java.util.Scanner;

public class func {
    public static void year() {
        Scanner scanner = new Scanner(System.in);

        int res = 0;
        while (true) {
            System.out.print("Введите год в формате 'yyyy': ");
            int a = scanner.nextInt();
            System.out.print("Введите количество дней: ");
            int b = scanner.nextInt();
            if ((a % 400 == 0) || (a % 4 == 0 &&  a % 100 != 0)) {
                if (b == 366) {
                    res++;
                    continue;
                } else if (b == 365) {
                    System.out.println("Неправильно!");
                    break;
                } else {
                    System.out.println("Неправильно!");
                    break;
                }
            } else {
                if (b == 366) {
                    System.out.println("Неправильно!");
                    break;
                } else if (b == 365) {
                    res++;
                    continue;
                } else {
                    System.out.println("Неправильно!");
                    break;
                }
            }
        }
        System.out.println(res);

    }
}
