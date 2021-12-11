package lab4;

public class Operation {

    public static double findOptimal(Shares share1, Shares share2, double correlation){

        double risk1 = share1.getRisk();
        double risk2 = share2.getRisk();

        double norm1 = share1.getNorm();
        double norm2 = share2.getNorm();

        double x1 = (risk1 * risk1 - correlation * risk1 * risk2) /
                (risk1 * risk1 + risk2 * risk2 - 2 * risk1 * risk2);

        double x2 = 1 - x1;

        double m = x1 * norm1 + x2 * norm2;

        return Math.sqrt(x1 * x1 * risk1 *risk1 +
                x2 * x2 * risk2 * risk2 +
                2 * x1 * x2 * risk1 * risk2 * correlation);
    }

}
