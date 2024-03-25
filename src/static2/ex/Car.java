package static2.ex;

import javax.xml.namespace.QName;

public class Car {
    private String name;
    private static int totalCars;


    public Car(String name) {
        System.out.println("차량 구입, 이름:" + name);
        this.name = name;
        totalCars++;
    }

    static void showTotalCars() {
        System.out.println("구매한 차량의 수는 " + totalCars);
    }
}
