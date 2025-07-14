package application;

public class Product {
    private String name;
    private Double price;

    public Product(){
    }

    public Product(String name, Double price){
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public String toString(){
        return String.format("Name: %s | Price: R$ %.2fd", name, price);
    }
}
