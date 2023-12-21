package gb.ClassWork.Seminar1;

//        Task 0
//        Реализуйте метод, принимающий в качестве аргумента
//        целочисленный массив.
//        Если длина массива меньше некоторого заданного минимума,
//                метод возвращает -1, в качестве кода ошибки, иначе - длину
//        массива.

public class Task0 {
    public static int returnArrLength(int[] arr){
        if(arr == null || arr.length < Program.size){
            return -1;
        }
        return arr.length;
    }
}
