package be.intecbrussel;


public class Soda extends Drink implements Orderable {

    final double PRICE = 2;
    @Override
    public double getPrice() {
        return PRICE;
    }
}
