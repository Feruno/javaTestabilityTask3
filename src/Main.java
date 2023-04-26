public class Main {
    public static void main(String[] args) {

        CreditPaymentService creditServ = new CreditPaymentService();
        int ostatok = 1_000_000;
        int year = 1;
        double pp = 9.99;
        int res = creditServ.calculate(ostatok, year, pp);
        System.out.println("Ежемесячный платёж: "+ res + " на " + year + " год(а)");

        year = 2;
        int res2 = creditServ.calculate(ostatok, year, pp);
        System.out.println("Ежемесячный платёж: "+ res2 + " на " + year + " год(а)");

        year = 3;
        int res3 = creditServ.calculate(ostatok, year, pp);
        System.out.println("Ежемесячный платёж: "+ res3 + " на " + year + " год(а)");


        /*
        double res;
        double result;
        int ostatok = 1_000_000;
        int mes = 24;
        double pp = 9.99;
        res = Math.pow( ( 1 + (pp/(100*pp)) ), - mes);
        result = ostatok * (0.01 / (1-res) );
        System.out.println("res "+ (int) res);
        System.out.println("result "+ (int) result);
        */
    }
}