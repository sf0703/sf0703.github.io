public class NormalPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double appleWeight, double strawberryWeight, double mangoWeight) {
        return appleWeight * new Apple().getPricePerPound() +
               strawberryWeight * new Strawberry().getPricePerPound() +
               mangoWeight * new Mango().getPricePerPound();
    }
}


