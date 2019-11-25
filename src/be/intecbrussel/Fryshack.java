package be.intecbrussel;


public class Fryshack {

    private String name;

    public Fryshack(String string) {
        this.name = string;
    }

    public String getName() {
        return name;
    }

    public void makeOrders() {
        makeOrderOne();
        makeOrderTwo();
        makeOrderTree();
        makeOrderFour();
    }

    // make an order by making Fries, Sauce and Drink Objects and setting them with
    // there Setters
    private void makeOrderOne() {

        Order order1 = new Order();
        order1.setOrderNumber(1);
        order1.setOrder1();



        order1.fryOrder();
        //System.out.println(order1.CalculateTotal());
    }

    // make an order by making new Fries, Sauce and Drink Objects and setting them
    // with there Constructors
    private void makeOrderTwo() {

        Order order2 = new Order();
        order2.setOrderNumber(2);
        order2.setOrder2();


        order2.fryOrder();
        //System.out.println(order2.CalculateTotalPrice());
    }

    // make an onlineOrder with a Orderable array
    private void makeOrderTree() {


        Order order3 = new Order();
        order3.setOrderNumber(3);
        order3.setOrder3();
        order3.fryOrder();
        //System.out.println(order3.CalculateTotalPrice());

    };

    // make an your own Order
    private void makeOrderFour() {

        Order order4 = new Order();
        order4.setOrderNumber(4);
        order4.setOrder4();
        order4.fryOrder();
        //System.out.println(order3.CalculateTotalPrice());

    };

}
