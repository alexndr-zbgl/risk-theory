package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Operation {

    public List<Double> lValues(){
        List<Double> maxValues = new ArrayList<>();
        maxValues.add(Collections.max(GasStation.getFirstProduct()));
        maxValues.add(Collections.max(GasStation.getSecondProduct()));
        maxValues.add(Collections.max(GasStation.getThirdProduct()));
        return maxValues;
    }

    public List<Double> minValue(){
        List<Double> result = new ArrayList<>();
        List<Double> lValues = lValues();
        List<Double> first  = new ArrayList<>();
        List<Double> second  = new ArrayList<>();
        List<Double> third  = new ArrayList<>();

        for(int i = 0; i < GasStation.getFirstProduct().size(); i++){
            first.add(lValues.get(0) - GasStation.getFirstProduct().get(i));
        }

        result.add(Collections.max(first));

        for(int i = 0; i < GasStation.getSecondProduct().size(); i++){
            second.add(lValues.get(1) - GasStation.getSecondProduct().get(i));
        }

        result.add(Collections.max(second));

        for(int i = 0; i < GasStation.getThirdProduct().size(); i++){
            third.add(lValues.get(2) - GasStation.getThirdProduct().get(i) );
        }

        result.add(Collections.max(third));

        return result;
    }
}
