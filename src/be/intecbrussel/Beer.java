package be.intecbrussel;
public class Beer extends Drink implements Orderable {

    final double PRICE = 2.5;

    @Override
    public double getPrice() {
        return PRICE;
    }
}
