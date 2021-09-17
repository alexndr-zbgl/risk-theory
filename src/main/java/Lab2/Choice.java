package Lab2;

import java.util.Objects;

public class Choice {
    private double[] profit;
    private double[] probability;

    private double sigma;


    public Choice(double[] profit, double[] probability){

        this.profit = profit;
        this.probability = probability;
    }


    public double getSigma() {

        return sigma;
    }


    public double expectCalculation(){

        return probability[0]*profit[0] + probability[1]*profit[1];
    }


    public double variationCalculation(){

        return probability[0]*(profit[0]-expectCalculation())*(profit[0]-expectCalculation()) +
                probability[1]*(profit[1]-expectCalculation())*(profit[1]-expectCalculation());
    }


    public double sigmaCalculation(){

        return Math.sqrt(variationCalculation());
    }


}
