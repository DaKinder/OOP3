package Generics;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends Number> { //Сщздали Generic. У всех переменных типа T можно испозьзовать все методы Number
    // public class Storage<T extends IntInterface & DoubleInterface> { // реализация множественного наследования
    // T как минимум является наследником Number

    // Класс который хранит набор чисел, либо все Doubel, либо все Integer, ....
    // Класс должен иметь 2 метода, добавить число и посчитать сумму чисел

    private List<T> numbers;

    public Storage(){
        numbers = new ArrayList<>(); // память должна выделяться в конструкторе
    }
    public void add(T x){
        numbers.add(x);
    }
    public int getSum(){
        int sum = 0;
        for (T number: numbers) {
            sum += number.intValue();
        }
        return sum;
    }


}
