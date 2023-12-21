package gb.ClassWork.Seminar1;

//        Task 7
//        Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
//        возвращающий новый массив, каждый элемент которого равен сумме элементов двух
//        входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Task7 {

    public static int[] multiplyArrays(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length) throw new RuntimeException("[Массивы не равны]");
        int[] newArray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = (arr1[i] + arr2[i]);
        }
        return newArray;
    }

}
