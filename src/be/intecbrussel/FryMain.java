package be.intecbrussel;
public class FryMain {

    public static void main(String[] args) {

        Fryshack jammies = new Fryshack("Jammies");
        jammies.makeOrders();

        System.out.println("totaal aantal orders zijn: " + Order.getOrderNumber());
    }

}
