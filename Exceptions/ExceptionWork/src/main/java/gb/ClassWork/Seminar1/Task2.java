package gb.ClassWork.Seminar1;

//        Task 2
//        Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//        Необходимо посчитать и вернуть сумму элементов этого массива.
//        При этом накладываем на метод 2 ограничения: метод может работать только с
//        квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
//        только значение 0 или 1.
//        Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
//        ошибке.

public class Task2 {
    public static int arraySumCounter2D(byte[][] arr){
        int count = 0;
        if(arr == null) throw new RuntimeException();
        for (byte[] internal: arr) {
            if(internal == null) throw new RuntimeException("[Не все вложенные массивы инициализированы]");
        }
        if(arr.length != arr[0].length) return -1;
        for(byte[] i : arr){
            for(int j : i){
                if(j < 0 || j > 1) throw new RuntimeException("[В массивые есть значения отличные от 0 и 1]");
                count++;
            }
        }
        return count;
    }
}
