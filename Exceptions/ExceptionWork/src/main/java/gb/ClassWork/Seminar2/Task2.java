package gb.ClassWork.Seminar2;

import java.util.InputMismatchException;

// Task 2
// Обработайте возможные исключительные ситуации. “Битые” значения в
// исходном массиве считайте нулями. Можно внести в код правки,
// которые считаете необходимыми.

public class Task2 {
    public static void main(String[] args) {
        String[][] arr = {
                {null,".","1"},
                {null,"1","1","X"},
                {"1",null}
        };
        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr){
        int sum = 0;
        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {val = Integer.parseInt(arr[i][j]);}
                catch (NumberFormatException e) {val = 0;}
                finally {sum += val;}
            }
        }
        return sum;
    }
}
