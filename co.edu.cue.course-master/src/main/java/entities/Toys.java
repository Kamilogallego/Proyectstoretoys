package entities;

public class Toys {

    private String name;
    private int type; // 0 -> Female, 1 -> Male, 2 -> Unisex
    private double price;
    private int quantities;

    public Toys(String name, int type, double price, int quantities) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantities = quantities;
    }

    public Toys() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantities() {
        return quantities;
    }

    public void setQuantities(int quantities) {
        this.quantities = quantities;
    }

    @Override
    public String toString() {
        return "toy{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", quantities=" + quantities +
                '}';
    }
}