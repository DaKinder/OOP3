package Generics;

import java.util.ArrayList;
import java.util.List;

public class Program extends {
    public static void main(String[] args) {
        Storage<Integer > storage;
        storage = new Storage<>();
        // storage.add(2.3); не скомпилируется, ибо иной тип
        storage.add(5);
        storage.add(3);

        System.out.println(storage.getSum());
        List<Account> accounts = new ArrayList<>();
        List<AbstractAccount> abstractAccounts = new ArrayList<>();
        foo(accounts);
        foo(abstractAccounts);
    }
    // Дженерик на методе
    private static <T extends Account> void foo(List<T> accounts){}
    //Полиморфищм в дженериках не работает,
}


