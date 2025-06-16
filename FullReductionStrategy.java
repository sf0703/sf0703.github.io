public class FullReductionStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double appleWeight, double strawberryWeight, double mangoWeight) {
        double originalPrice = appleWeight * new Apple().getPricePerPound() +
                strawberryWeight * new Strawberry().getPricePerPound() * 0.8 +
                mangoWeight * new Mango().getPricePerPound();
        // 计算可以减免的次数
        int discountCount = (int) (originalPrice / 100);
        // 计算减免的总金额
        double discountAmount = discountCount * 10;
        // 返回减免后的价格
        return originalPrice - discountAmount;
    }
}

