package class2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int num = in.nextInt();

            if (num > 0) {
                num = num + 1;
            }
            else if (num < 0){
                num = num - 2;
            }
            else
                num += 10;
            System.out.println(num);
        }
    }
}
