
public class Program {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(3.4));
        appleBox.add(new Apple(6.6));
        appleBox.add(new GoldenApple(5.1));

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(3.2));

        Box<GoldenApple> goldenAppleBox = new Box<>();
        goldenAppleBox.add(new GoldenApple(8.4));

        goldenAppleBox.move(appleBox);
        }
}