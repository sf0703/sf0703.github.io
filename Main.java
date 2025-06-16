public class Main {
    public static void main(String[] args) {
        // 场景 1: 顾客 A 购买苹果和草莓
        // 假设顾客 A 购买了 2 斤苹果和 3 斤草莓
        Order orderA = OrderFactory.createOrder(1, 2, 3, 0); // 芒果斤数为 0
        double totalA = orderA.calculateTotal();
        System.out.println("顾客 A 购买总价: " + totalA + " 元");
        // 验证: 2 * 8 + 3 * 13 = 16 + 39 = 55
        assert totalA == 55.0 : "场景 1 计算错误";

        // 场景 2: 顾客 B 购买苹果、草莓和芒果
        // 假设顾客 B 购买了 1 斤苹果, 2 斤草莓和 1 斤芒果
        Order orderB = OrderFactory.createOrder(2, 1, 2, 1);
        double totalB = orderB.calculateTotal();
        System.out.println("顾客 B 购买总价: " + totalB + " 元");
        // 验证: 1 * 8 + 2 * 13 + 1 * 20 = 8 + 26 + 20 = 54
        assert totalB == 54.0 : "场景 2 计算错误";

        // 场景 3: 顾客 C 购买苹果、草莓和芒果，草莓 8 折
        // 假设顾客 C 购买了 2 斤苹果, 2 斤草莓和 1 斤芒果
        Order orderC = OrderFactory.createOrder(3, 2, 2, 1);
        double totalC = orderC.calculateTotal();
        System.out.println("顾客 C 购买总价: " + totalC + " 元");
        // 验证: 2 * 8 + 2 * 13 * 0.8 + 1 * 20 = 16 + 20.8 + 20 = 56.8
        assert totalC == 56.8 : "场景 3 计算错误";

        // 场景 4: 顾客 D 购买苹果、草莓和芒果，满 100 减 10
        // 假设顾客 D 购买了 5 斤苹果, 5 斤草莓和 5 斤芒果
        Order orderD = OrderFactory.createOrder(4, 5, 5, 5);
        double totalD = orderD.calculateTotal();
        System.out.println("顾客 D 购买总价: " + totalD + " 元");
        // 验证: 5 * 8 + 5 * 13 * 0.8 + 5 * 20 = 40 + 52 + 100 = 192. 192 - 10 = 182
        assert totalD == 182.0 : "场景 4 计算错误";

        System.out.println("所有测试通过！");
    }
}


