package mappers.dtos;

public class ToyDTO {

    private String name;
    private int type;
    private double price;
    private int quantities;

    public ToyDTO() {
    }

    public ToyDTO(String name, int type, double price, int quantities) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantities = quantities;
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
}