public class FullReductionStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double appleWeight, double strawberryWeight, double mangoWeight) {
        double originalPrice = appleWeight * new Apple().getPricePerPound() +
                               strawberryWeight * new Strawberry().getPricePerPound() * 0.8 +
                               mangoWeight * new Mango().getPricePerPound();
        if (originalPrice >= 100) {
            return originalPrice - 10;
        } else {
            return originalPrice;
        }
    }
}


