/**
 * INTERFACE: Define UM CONTRATO que as classes devem seguir.
 * Para estudos: Promove o desacoplamento (DIP - Dependency Inversion Principle).
 * Na Certificação: Métodos em interfaces são implicitamente 'public abstract'.
 */
public interface PaymentProcessor {
    // Define a ação de processar pagamento, obrigando o tratamento da exceção
    void processPayment(double amount) throws InsufficientFundsException;
}
