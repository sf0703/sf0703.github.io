# 超市水果价格计算程序

这是一个使用 Java 编写的超市水果价格计算程序，它采用了工厂模式和面向对象的设计思想，解决了不同促销场景下的价格计算问题，并包含了测试验证。

## 项目结构

```
.  
├── Apple.java
├── Fruit.java
├── FullReductionStrategy.java
├── Main.java
├── Mango.java
├── NormalPricingStrategy.java
├── Order.java
├── OrderFactory.java
├── PricingStrategy.java
├── Strawberry.java
├── StrawberryDiscountStrategy.java
└── README.md
```

## 类说明

-   **`Fruit.java`**: 水果接口，定义了 `getPricePerPound()` 方法。
-   **`Apple.java`, `Strawberry.java`, `Mango.java`**: 具体的水果类，实现了 `Fruit` 接口，并返回各自的单价。
-   **`PricingStrategy.java`**: 定价策略接口，定义了 `calculatePrice()` 方法。
-   **`NormalPricingStrategy.java`**: 普通定价策略，不包含任何折扣或满减。
-   **`StrawberryDiscountStrategy.java`**: 草莓八折定价策略。
-   **`FullReductionStrategy.java`**: 满100减10的定价策略，该策略在草莓八折的基础上进行满减。
-   **`Order.java`**: 订单类，包含购买的水果斤数和定价策略，并提供 `calculateTotal()` 方法计算总价。
-   **`OrderFactory.java`**: 订单工厂类，根据不同的场景创建对应的订单对象，并注入相应的定价策略。
-   **`Main.java`**: 主程序入口，包含了四个场景的测试用例，并验证了计算结果的正确性。

## 如何编译和运行 (Windows 环境)

1.  **确保安装 Java 开发工具包 (JDK)**
    请访问 Oracle 官网或 AdoptOpenJDK 网站下载并安装适用于您 Windows 系统的 JDK 版本（推荐 JDK 8 或更高版本）。安装完成后，请确保将 JDK 的 `bin` 目录添加到系统的 `Path` 环境变量中。

2.  **编译源代码**
    打开命令提示符 (CMD) 或 PowerShell，导航到包含所有 `.java` 文件的目录（例如，如果文件在 `C:\Users\YourUser\supermarket_pricing` 目录下，则输入 `cd C:\Users\YourUser\supermarket_pricing`）。然后执行以下命令编译所有文件：
    ```cmd
    javac *.java
    ```

3.  **运行程序**
    编译成功后，执行以下命令运行 `Main` 类。**请注意，为了使 `assert` 断言生效，您需要在运行 Java 程序时添加 `-ea` (enable assertions) 参数：**
    ```cmd
    java -ea Main
    ```

    程序将输出每个场景的计算结果，并在所有测试通过时显示“所有测试通过！”。如果断言失败，程序将抛出 `AssertionError`。

## 场景说明

程序中包含了以下四个场景的计算和验证：

1.  **场景 1**: 顾客 A 购买苹果和草莓（无芒果）。
2.  **场景 2**: 顾客 B 购买苹果、草莓和芒果。
3.  **场景 3**: 顾客 C 购买苹果、草莓和芒果，草莓限时打 8 折。
4.  **场景 4**: 顾客 D 购买苹果、草莓和芒果，草莓限时打 8 折，并且购物满 100 减 10 块。


