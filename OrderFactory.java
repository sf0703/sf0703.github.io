public class OrderFactory {
    public static Order createOrder(int scenario, double appleWeight, double strawberryWeight, double mangoWeight) {
        PricingStrategy strategy;
        switch (scenario) {
            case 1:
                strategy = new NormalPricingStrategy();
                break;
            case 2:
                strategy = new NormalPricingStrategy(); // Scenario 2 also uses normal pricing for all three fruits
                break;
            case 3:
                strategy = new StrawberryDiscountStrategy();
                break;
            case 4:
                strategy = new FullReductionStrategy();
                break;
            default:
                throw new IllegalArgumentException("Invalid scenario: " + scenario);
        }
        return new Order(appleWeight, strawberryWeight, mangoWeight, strategy);
    }
}


