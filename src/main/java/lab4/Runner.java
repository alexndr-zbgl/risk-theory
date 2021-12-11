package lab4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Runner {

    public static void main(String[] args) {
        Shares shares1 = new Shares(60, 0.4);
        Shares shares2 = new Shares(50, 0.3);
        Shares shares3 = new Shares(40, 0.25);
        Shares shares4 = new Shares(70, 0.5);

        double P12 = 0.2;
        double P13 = -0.3;
        double P23 = -0.5;
        double P14 = 0.9;
        double P24 = 0.7;
        double P34 = -0.3;

        List<Double> min = new ArrayList<>();

        min.add(Operation.findOptimal(shares1, shares2, P12));
        min.add(Operation.findOptimal(shares1, shares3, P13));
        min.add(Operation.findOptimal(shares1, shares4, P14));
        min.add(Operation.findOptimal(shares2, shares3, P23));
        min.add(Operation.findOptimal(shares2, shares4, P24));
        min.add(Operation.findOptimal(shares3, shares4, P34));

        System.out.println("Optimal is " + Collections.min(min));
    }

}
