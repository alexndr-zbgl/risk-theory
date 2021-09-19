import Lab1.STATE;
import Lab1.Utility;
import Lab2.Choice;

public class Main {

    /*private static Choice company1;
    private static Choice company2;
    private static Choice alliance;*/



    public static void main(String[] args) {

        /*company1 = new Choice(new double[]{8, -0.5}, new double[]{0.6, 0.4});
        company2 = new Choice(new double[]{12, -0.5}, new double[]{0.7, 0.3});
        alliance = new Choice(new double[]{25, -1}, new double[]{0.3, 0.7});

        System.out.println("Sigma of company 1 : " + company1.sigmaCalculation());
        System.out.println("Sigma of company 2 : " + company2.sigmaCalculation());
        System.out.println("Sigma of the alliance : " + alliance.sigmaCalculation());


        if(company1.getSigma()<company2.getSigma()&&company1.getSigma()<alliance.getSigma()){
            System.out.println("Choose Company 1");
        }
        else if(company2.getSigma()<company1.getSigma()&&company2.getSigma()<alliance.getSigma()){
            System.out.println("Choose Company 2");
        }
        else if(alliance.getSigma()<company2.getSigma()&&alliance.getSigma()<company1.getSigma()){
            System.out.println("Choose Alliance");
        }*/

        Utility home = new Utility(new double[]{0.6, 0.4}, new STATE[]{STATE.BAD, STATE.GOOD});
        Utility forest = new Utility(new double[]{0.6, 0.4}, new STATE[]{STATE.VERY_GOOD, STATE.OK});

        System.out.println("M(home): " + home.utilityCalculation());
        System.out.println("M(forest): " + forest.utilityCalculation());

    }
}
