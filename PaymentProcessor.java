public interface PaymentProcessor {
    void processPayment(double amount) throws InsufficientFundsException;
}
