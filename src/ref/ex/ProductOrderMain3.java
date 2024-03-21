package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int orderCount = sc.nextInt();
        ProductOrder[] orders = new ProductOrder[orderCount];

        for (int i = 0; i < orderCount; i++) {
            System.out.println(i + 1 + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = sc.next();
            System.out.print("가격: ");
            int price = sc.nextInt();
            System.out.print("수량: ");
            int quantity = sc.nextInt();

            orders[i] = createOrder(productName, price, quantity);
        }
        printOrders(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("상품 총 가격: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명:" + order.productName + " 상품 가격:" + order.price + " 상품 수량:" + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }
}
