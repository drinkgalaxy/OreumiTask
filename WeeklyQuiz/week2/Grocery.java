package chapter08;

public class Grocery extends Product implements DeliveryChargeCalculator {
    public Grocery(String name, int weight, int price) {
        super(name, weight, price);
    }
    @Override
    public int getDeliveryCharge(int weight, int price) {
        int delivarycharge = 0;
        if (weight < 3) {
            delivarycharge = 1000;
        } else if (weight >= 3 && weight < 10) {
            delivarycharge = 5000;
        } else {
            delivarycharge = 10000;
        }

        if (price < 30000) {
            return delivarycharge;
        } else if (price >= 30000 && price > 100000) {
            delivarycharge -= 1000;
        } else {
            delivarycharge = 0;
        }
        return delivarycharge;
    }
}
