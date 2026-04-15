/**
 * @FunctionalInterface: Interface com apenas UM método abstrato.
 * Para estudos: Permite o uso de expressões Lambda.
 */
@FunctionalInterface
public interface TransactionValidator {
    boolean isValid(double amount);
}
