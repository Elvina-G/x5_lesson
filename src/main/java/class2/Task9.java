package class2;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {

        int[] numbers = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};

        //Выводим изначальный массив в консоль
        for (int i=0; i<numbers.length; i++){
            System.out.print(" " + numbers[i]);
        }
        System.out.println();

        int n = numbers.length;
        //Переменная, которая будет использоваться при обмене элементов
        int temp;

        for (int i = 0; i < n/2; i++) {
            temp = numbers[n-i-1];
            numbers[n-i-1] = numbers[i];
            numbers[i] = temp;
        }
        //Выводим конечный массив в консоль
        for (int i=0; i<numbers.length; i++){
            System.out.print(" " +numbers[i]);
        }
    }
}
