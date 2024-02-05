package chapter08;

public class Cart {
    public Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        int delivarycharge = 0;
        int weight = 0;
        int price = 0;

        for (int i = 0; i < 3; i++) {
            weight += this.products[i].getWeight();
            price += this.products[i].getPrice();
        }

        if (weight < 3) {
            delivarycharge = 1000;
        } else if (weight >= 3 && weight < 10) {
            delivarycharge = 5000;
        } else {
            delivarycharge = 10000;
        }

        if (price < 30000) {
            return delivarycharge;
        } else if (price >= 30000 && price < 100000) {
            delivarycharge -= 1000;
        } else {
            delivarycharge = 0;
        }
        return delivarycharge;
    }
}

