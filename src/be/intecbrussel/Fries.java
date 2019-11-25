package be.intecbrussel;

public class Fries implements Orderable {

    private FrySizes size;
    private double price;
    private int portionCount;

    public Fries() {
    }

    public Fries(FrySizes size) {
        this.size = size;
    }

    public FrySizes getSize() {
        return size;
    }

    public void setSize(FrySizes size) {
        this.size = size;
    }

    public double getPrice() {
        return size.getPrice();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPortionCount() {
        return portionCount;
    }

    public void setPortionCount(int portionCount) {
        this.portionCount = portionCount;
    }

    public void calculatePrice() {


    }


}
