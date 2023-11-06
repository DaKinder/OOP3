import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box <T extends Fruit> implements Iterable<T>{

    // Fields
    private final List<T> fruits;
    Double totalWeight;

    //Constructor
    public Box() {fruits = new ArrayList<>();}

    // Methods
    public void add(T fruit) {fruits.add(fruit);}
    public Double getWeight() {
        for (T fruit : fruits) {this.totalWeight += fruit.getWeight();}
        return totalWeight;
    }
    public void move(Box<? super T> another) {
        another.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
    @Override
    public Iterator<T> iterator() {
        return fruits.iterator();
    }
}
