package lab5;

import java.util.ArrayList;
import java.util.List;


public class GasStation {

    private static List<Double> firstProduct = List.of(6.0, 3.5, 0.5);
    private static List<Double> secondProduct = List.of(6.5, 7.0, 4.0);
    private static List<Double> thirdProduct = List.of(3.5, 3.5, 8.5);

    public static List<Double> getFirstProduct() {
        return firstProduct;
    }

    public static List<Double> getSecondProduct() {
        return secondProduct;
    }

    public static List<Double> getThirdProduct() {
        return thirdProduct;
    }
}
