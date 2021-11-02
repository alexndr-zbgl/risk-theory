package lab3;

public class InvestChoice {

    private double capital;
    private double x;
    private double p;
    private double y;

    public InvestChoice(double capital){
        this.capital = capital;
        this.x = capital * 0.5;
        this.y = capital;
    }

    public InvestChoice(double capital, double profit, double p){
        this.capital = capital;
        this.x = capital * profit;
        this.p = p;
        this.y = 0;
    }

    public InvestChoice(double capital, double x, double p, double y){
        this.capital = capital;
        this.x = capital * x;
        this.p = p;
        this.y = capital * y;
    }

    public double toType(double number){
        return 2*Math.sqrt(number);
    }

    public double expectedWin(){
        return x*p+y*(1-p);
    }

    public double expectedEfficient(){
        return p*toType(x) + (1-p)*toType(y);
    }

    public double determinedEquivalent(){
        return expectedEfficient()/2 * expectedEfficient()/2;
    }

    public double bonus(){
        return expectedWin() - determinedEquivalent();
    }


}
