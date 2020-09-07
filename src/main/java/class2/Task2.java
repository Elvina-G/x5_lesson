package class2;

import java.util.Scanner;

public class Task2 {
    private static int getSumNumabsrsFromString(String numBox) {
        int summ = 0;
        for (char frorStr : numBox.toCharArray())
            summ += Character.digit(frorStr, 10);
        return summ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        String lol = (String.valueOf(num));

        System.out.printf("Your number: %d \n", getSumNumabsrsFromString(lol));
        in.close();

    }
}
