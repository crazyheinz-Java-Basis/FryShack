package be.intecbrussel;

import java.text.DecimalFormat;

public class Order {

    private static int orderNumber = 1;
    private Orderable[] order = new Orderable[0];

    public Orderable[] getOrder() {
        return order;
    }

    public void setOrder1() {

        Fries fries1 = new Fries();
        fries1.setSize(FrySizes.BIG);
        Fries fries2 = new Fries();
        fries2.setSize(FrySizes.MEDIUM);
        Sauce sauce1 = new Sauce();
        sauce1.setName("Mayonaise");
        Sauce sauce2 = new Sauce();
        sauce2.setName("Ketchup");
        Water water1 = new Water();
        Soda soda1 = new Soda();

        DecimalFormat df2 = new DecimalFormat(".##");

        double price = fries1.getPrice() + fries2.getPrice() + sauce1.getPrice() + sauce2.getPrice() + water1.getPrice() + soda1.getPrice();
        System.out.println("Bestelling nr" + orderNumber + " kost "+ df2.format(price) + " euro");

    }

    public void setOrder2() {

        Fries fries1 = new Fries(FrySizes.FAMILY);
        Sauce sauce1 = new Sauce("Mayonnaise");
        Sauce sauce2 = new Sauce("Mayonnaise");
        Sauce sauce3 = new Sauce("Ketchup");
        Water water1 = new Water();
        Soda soda1 = new Soda();
        Soda soda2 = new Soda();
        Soda soda3 = new Soda();

        DecimalFormat df2 = new DecimalFormat(".##");

        double price = fries1.getPrice() + sauce1.getPrice() + sauce2.getPrice() + sauce3.getPrice() + water1.getPrice() + soda1.getPrice() + soda2.getPrice() + soda3.getPrice();
        System.out.println("Bestelling nr" + orderNumber + " kost " + df2.format(price) + " euro");

    }



    public void setOrder3() {
        Orderable[] order1 = new Orderable[] { new Fries(),new Sauce(), new Beer()};
        ((Fries)order1[0]).setSize(FrySizes.BIG);
        ((Sauce)order1[1]).setName("Mayonaisse");

        System.out.println("Bestelling nr" + orderNumber + " kost " + CalculateTotalArray(order1) + " euro");

    }

    public void setOrder4() {
        Orderable[] order1 = new Orderable[] { new Fries(), new Fries(), new Fries(), new Sauce(), new Sauce(), new Beer()};
        ((Fries)order1[0]).setSize(FrySizes.BIG);
        ((Fries)order1[1]).setSize(FrySizes.FAMILY);
        ((Fries)order1[2]).setSize(FrySizes.SMALL);
        ((Sauce)order1[3]).setName("Mayonaisse");
        ((Sauce)order1[3]).setName("Andalouse");

        DecimalFormat df2 = new DecimalFormat(".##");

        System.out.println("Bestelling nr" + orderNumber + " kost " + df2.format(CalculateTotalArray(order1)) + " euro");

    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double CalculateTotalArray(Orderable[] order) {
        double price = 0;

        for (int i = 0; i < order.length; i++) {
            price += order[i].getPrice();

        }

        return price;
    }



    //Put everything in fryer
    public void fryOrder() {

        System.out.println("De frietjes zijn aan het bakken");

    }

    public static int getOrderNumber() {
        return orderNumber;
    }




}

