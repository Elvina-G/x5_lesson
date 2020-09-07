package class2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;
        int[] numbers = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};

        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Max = " + max);


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum = sum + numbers[i];
                counter ++;
            }
        }
        System.out.println("Сума положительных элементов массива = "+sum);
        System.out.println("Количество положительных элементов массива = "+counter);


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sum = sum = numbers[i];
            }
        }
        System.out.println("Сума отрицательных элементов массива = "+sum);
    }
}
