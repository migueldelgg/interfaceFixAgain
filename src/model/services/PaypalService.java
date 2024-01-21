package model.services;

public class PaypalService implements OnlinePaymentService {

    private static final double PAYMENT_FEE_VALUE = 0.02;
    private static final double INTEREST_VALUE = 0.01;

    @Override
    public double paymentFee(double amount) {
        return amount * PAYMENT_FEE_VALUE;
    }

    @Override
    public double interest(double amount, int months) {
        return amount * months * INTEREST_VALUE;
    }
}
