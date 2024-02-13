package models;

public class Toy {
    private String name;
    private char type;
    private double price;
    private int quantity;

    public Toy(String name, char type, double price, int quantity) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }



    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public int getType() {
        return type;
    }

    public double getPrice() {
        return price;

    }

    public double getQuantity() {
        return quantity;
    }

    public Object getName() {
        return name;
    }

    public int setQuantity(double v) {
        return quantity;
    }
}
