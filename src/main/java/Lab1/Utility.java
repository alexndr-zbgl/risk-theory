package Lab1;

public class Utility {

    private double[] probability;
    private STATE[] state;


    public Utility(double[] probability, STATE[] state){

        this.probability = probability;
        this.state = state;
    }


    public double utilityCalculation(){

        return probability[0] * state[0].number + probability[1] * state[1].number;
    }

}
