public class CreditPaymentService {
    public int calculate(int ostatok, int year, double pp ) {
        double res;
        double finalResult;

        res = Math.pow( ( 1 + (pp/(100*pp)) ), - (year * 12) );

        finalResult = ostatok * (0.01 / (1-res) );

        return (int) finalResult;
    }
}
