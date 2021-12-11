package lab4;

public class Shares {

    private double norm;
    private double risk;


    public Shares(double norm, double risk) {
        this.norm = norm;
        this.risk = risk;
    }

    public double getRisk() {
        return risk;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    public double getNorm() {
        return norm;
    }

    public void setNorm(double norm) {
        this.norm = norm;
    }
}
