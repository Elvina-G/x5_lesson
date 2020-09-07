package class2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int lastCharacter;
        lastCharacter = num%10;

        System.out.printf("Your number: %d \n", lastCharacter);
        in.close();

    }
}
