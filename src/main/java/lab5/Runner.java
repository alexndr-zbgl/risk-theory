package lab5;

import java.util.Collections;

public class Runner {


    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        Operation operation = new Operation();
        for(int i = 0; i < operation.minValue().size(); i++){
            System.out.println(operation.minValue().get(i));
        }
    }
}
