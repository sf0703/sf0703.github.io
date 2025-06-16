public class StrawberryDiscountStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double appleWeight, double strawberryWeight, double mangoWeight) {
        return appleWeight * new Apple().getPricePerPound() +
               strawberryWeight * new Strawberry().getPricePerPound() * 0.8 +
               mangoWeight * new Mango().getPricePerPound();
    }
}


