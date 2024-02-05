package chapter08;

public class Product implements Promotion{
    String name;
    int weight;
    int price;

    public Product (String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getDiscountAmount() {
        if (this.getName() == "grocery") {
            return 2000;
        } else if (this.getName() == "beauty") {
            return 10000;
        } else {
            return 0;
        }
    }

}
