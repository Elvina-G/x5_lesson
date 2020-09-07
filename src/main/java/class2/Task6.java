package class2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 0 && a % 2 != 0){
            System.out.println("отрицательное нечетное число");
        }
        else if (a < 0 && a != 0){
            System.out.println("отрицательное четное число");
        }
        else if (a == 0){
            System.out.println("нулевое число");
        }
        else if (a % 2 != 0 && a > 0){
            System.out.println("положительное нечетное число");
        }
        else if (a > 0 && a != 0){
            System.out.println("положительное четное число");
        }
    }
}
