@FunctionalInterface
public interface TransactionValidator {
    boolean isValid(double amount);
}
