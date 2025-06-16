public class Order {
    private double appleWeight;
    private double strawberryWeight;
    private double mangoWeight;
    private PricingStrategy pricingStrategy;

    public Order(double appleWeight, double strawberryWeight, double mangoWeight, PricingStrategy pricingStrategy) {
        this.appleWeight = appleWeight;
        this.strawberryWeight = strawberryWeight;
        this.mangoWeight = mangoWeight;
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateTotal() {
        return pricingStrategy.calculatePrice(appleWeight, strawberryWeight, mangoWeight);
    }
}


