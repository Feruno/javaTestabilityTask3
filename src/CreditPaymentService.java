public class CreditPaymentService {
    public double calculate(double balanceLoanAmount, int year, double monthlyInterestRate) {
        double interestRate; //месячная процентная ставка = годовая ставка / 12 / 100 вот так должно быть
        double auxiliaryResult;
        double result;

        interestRate = monthlyInterestRate / 12 / 100;
        auxiliaryResult = Math.pow(1 + interestRate, year * 12);
        result = balanceLoanAmount * interestRate * auxiliaryResult / (auxiliaryResult - 1);

        /*
        double res;
        double finalResult;
        res = Math.pow( (1 + (monthlyInterestRate / (100 * monthlyInterestRate)) ), -year * 12);
        finalResult = balanceLoanAmount * (0.01 / (1 - res));
        */

        return (int) result;
    }
}
