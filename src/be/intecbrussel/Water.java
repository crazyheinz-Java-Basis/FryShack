package be.intecbrussel;


public class Water extends Drink implements Orderable {

    final double PRICE = 1.5;

    @Override
    public double getPrice() {
        return PRICE;
    }


}
