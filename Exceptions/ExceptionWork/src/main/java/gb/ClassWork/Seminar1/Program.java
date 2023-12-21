package gb.ClassWork.Seminar1;

import java.util.concurrent.atomic.AtomicInteger;

public class Program {
    public static int size = 10;
    public static void main(String[] args) {

//        Code 0
//        Scanner scanner = new Scanner( System.in );
//        System.out.print("Введите длину массива, не менее 10 :");
//        int userInput = scanner.nextInt();

//        Code 1
//        int result = returnArrLength(new int[userInput]);
//        if (result == -1) System.out.println("массив меньше требуемой длины");
//        else System.out.printf("Длина массива: " +  result + " элементов");

//        Scanner scanner = new Scanner( System.in );
//        System.out.print("Введите искомое число: ");
//        int value = scanner.nextInt();
//        int[] arr = new int[]{1,2,3,7,10,5,7,8,4,-1,2,3};
//        int[] arr = null;
//        int result = returnArrLength( arr, value );
//        switch (result){
//            case -1 ->System.out.println("массив меньше требуемой длины");
//            case -2 -> System.out.println("Искомый элемент в массиве не найден");
//            case -3 -> System.out.println("Массив не был проинициализирован");
//            default -> System.out.println("Элемент найден под индексом " + result);
//        }

//        Code 2
//        byte[][] array2D = {
//                {1,1,1,0},
//                null,
//                {0,0,1,1},
//                null
//        };
//
//        byte[][] array2DNull= null;
//
//        int result = Task3.arraySumCounter2D(array2D);
//        if(result == -1) throw new RuntimeException("[Массив не квадратный]");
//        else System.out.printf("Кол-во элемнтов массива = " + result);

//        Code 4
//        Integer[] arr = {1,3,5,null,-5,null,null};
//        Task4.checkArrayForNullValues( arr );

//        Case JavaAtomic
//        int [] array = {1,2,6,1,9,-9,100};
//        AtomicInteger min = new AtomicInteger(array[0]);
//        AtomicInteger max = new AtomicInteger(array[0]);
//        JavaAtomic.array( array, min, max );
//        System.out.println(min);
//        System.out.println(max);

//        Code 7

        int[] arr1 = {1,2,3,4,5,1};
        int[] arr2 = {5,4,3,2,1};

        int[] multipliedArray = Task7.multiplyArrays( arr1, arr2);
        for (int i = 0; i < multipliedArray.length; i++) {
            System.out.println(multipliedArray[i]);
        }


    }
}
