package class2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите число 1: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите число 2: ");
        int b = sc.nextInt();
        System.out.println("Введите число 3: ");
        int c = sc.nextInt();

        System.out.println("Наименьший из введённых чисел:" + Math.min(Math.min(a, b), c));

    }
}
