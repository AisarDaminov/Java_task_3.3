public class CreditPaymentService {
    public int calculateMonthlyPayment (int loanAmount, int loanTern, double loanRate){
        double givenValue = loanRate / 100;
        int monthlyPayment;
        monthlyPayment = (int)
                ((loanAmount * (givenValue / 12)) * (
                        (Math.pow((1 + (givenValue / 12)), loanTern))/
                        (Math.pow((1 + (givenValue / 12)), loanTern)-1)));
        return monthlyPayment;
    }
}
