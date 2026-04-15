import java.time.LocalDateTime;

/**
 * RECORD (Java 16+): Classe imutável para transporte de dados.
 * Para estudos: Gera automaticamente getters, constructor, equals, hashCode e toString.
 */
public record TransactionReport(
    long cardNumber, 
    double amount, 
    LocalDateTime timestamp, 
    boolean success
) {
    /**
     * COMPACT CONSTRUCTOR: Usado para validação em Records.
     * Na Certificação: Records não podem estender outras classes.
     */
    public TransactionReport {
        if (amount < 0) throw new IllegalArgumentException("Valor negativo");
    }
}
