public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int firstLoanAmount = 1_000_000;
        int firstLoanTern = 12;
        double firstLoanRate = 9.99;
        int monthlyPaymentAmount = service.calculateMonthlyPayment(firstLoanAmount, firstLoanTern, firstLoanRate);
        System.out.println("Your monthly payment for 12 months is " + monthlyPaymentAmount);

        int secondLoanAmount = 1_000_000;
        int secondLoanTern = 24;
        double secondLoanRate = 9.99;
        int monthlyPaymentAmount2 = service.calculateMonthlyPayment(secondLoanAmount, secondLoanTern, secondLoanRate);
        System.out.println("Your monthly payment for 24 months is " + monthlyPaymentAmount2);

        int thirdLoanAmount = 1_000_000;
        int thirdLoanTern = 36;
        double thirdLoanRate = 9.99;
        int monthlyPaymentAmount3 = service.calculateMonthlyPayment(thirdLoanAmount, thirdLoanTern, thirdLoanRate);
        System.out.println("Your monthly payment for 36 months is " + monthlyPaymentAmount3);
    }
}