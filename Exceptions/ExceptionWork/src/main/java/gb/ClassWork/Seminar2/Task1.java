package gb.ClassWork.Seminar2;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

// Task 1
// Посмотрите на этот код. Все ли с ним хорошо? Если нет, то скорректируйте его и
// обоснуйте свое решение.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Укадите числовой индекс массива от 0 до " + (arr.length -1) + " запишем число 1: ");

        try {
            Integer index = scanner.nextInt();
            if(index.intValue() < arr.length && index.intValue() >= 0) arr[index] = 1;
            else System.out.println("Вы ввели индекс за пределами массива");
        }
            catch (InputMismatchException | NullPointerException e) {
            System.out.println("Вы ввели не число, запись не произошла");
        }
        System.out.println( Arrays.toString( arr ) );
    }
}
