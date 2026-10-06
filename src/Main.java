//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1234, "Телефон", 50000, "Техника");
        Product product2 = new Product(4321, "Наушники", 10000, "Аксессуары");
        Product product3 = new Product(1234, "Телефон", 50000, "Техника");
        System.out.println(product1);
        System.out.println(product1.equals(product2));
        System.out.println(product1.equals(product3));

        ///

        Order order1 = new Order("Maksim", new Product[] {product1, product2});
        Order order2 = new Order("Nikita", new Product[]{product1, product3});
        Order order3 = new Order("Maksim", new Product[] {product1, product2});
        System.out.println(order1);
        System.out.println(order1.equals(order2));
        System.out.println(order1.equals(order3));

    }
}