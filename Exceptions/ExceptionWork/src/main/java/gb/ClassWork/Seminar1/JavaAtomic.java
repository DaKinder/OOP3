package gb.ClassWork.Seminar1;

import java.util.concurrent.atomic.AtomicInteger;

public class JavaAtomic {
    public static void array(int[] arr, AtomicInteger min , AtomicInteger max){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min.get()) min.set( arr[i] );
            if (arr[i] > max.get()) max.set( arr[i] );
        }
    }
}
