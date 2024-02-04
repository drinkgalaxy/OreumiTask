package chapter08;

public class week2Quiz {
    public static void main(String[] args) {
        Beauty beauty = new Beauty("크림", 1, 20000);
        Grocery grocery = new Grocery("감자", 9, 50000);
        LargeAppliance largeAppliance = new LargeAppliance("냉장고", 62, 450000);

        System.out.println(beauty.getDeliveryCharge(beauty.weight, beauty.price));
        System.out.println(beauty.getDeliveryCharge(grocery.weight, grocery.price));
        System.out.println(beauty.getDeliveryCharge(largeAppliance.weight, largeAppliance.price));

    }
}
