package be.intecbrussel;


public class Sauce implements Orderable {

    final double PRICE = 0.8;
    private String name;

    public Sauce() {
    }

    public Sauce(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return PRICE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
