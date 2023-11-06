package Generics;

public class CreditAccount extends AbstractAccount {

    Integer amount;

    @Override
    public void take(Integer amount) {
        this.amount -= amount;
    }

    @Override
    public void put(Integer amount) {
        this.amount -= amount;
    }
}
