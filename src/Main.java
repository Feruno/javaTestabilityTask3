public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditServ = new CreditPaymentService();
        double balanceLoanAmount = 1_000_000;
        int years = 1;
        double monthlyInterestRate = 9.99;
        double res = creditServ.calculate(balanceLoanAmount, years, monthlyInterestRate);
        System.out.println("Ежемесячный платёж: " + res + " на " + years + " год(а)");

        years = 2;
        double res2 = creditServ.calculate(balanceLoanAmount, years, monthlyInterestRate);
        System.out.println("Ежемесячный платёж: " + res2 + " на " + years + " год(а)");

        years = 3;
        double res3 = creditServ.calculate(balanceLoanAmount, years, monthlyInterestRate);
        System.out.println("Ежемесячный платёж: " + res3 + " на " + years + " год(а)");

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