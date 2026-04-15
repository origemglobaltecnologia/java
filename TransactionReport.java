import java.time.LocalDateTime;

public record TransactionReport(
    long cardNumber, 
    double amount, 
    LocalDateTime timestamp, 
    boolean success
) {
    // Exemplo de compact constructor para validação no record
    public TransactionReport {
        if (amount < 0) throw new IllegalArgumentException("Valor negativo");
    }
}
