import java.util.Objects;
import java.util.Optional;

/**
 * ABSTRACT CLASS: Não pode ser instanciada diretamente.
 * Para estudos: Serve como modelo (template) para classes filhas.
 * Implementa PaymentProcessor: Obriga as filhas a terem lógica de pagamento.
 */
public abstract class Card implements PaymentProcessor {
    // ATRIBUTOS PRIVADOS: Encapsulamento (Proteção dos dados)
    private long number;
    private double balance;
    private CardStatus status;

    public Card(long number) {
        this.number = number;
        this.status = CardStatus.ACTIVE;
        this.balance = 0.0;
    }

    // GETTER: Acesso controlado ao atributo privado
    public long getNumber() {
        return this.number;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * OPTIONAL: Tecnologia do Java 8+ para evitar NullPointerException.
     * Para estudos: Indica que o retorno pode ou não conter um valor.
     */
    public Optional<Double> getBalance() {
        return Optional.ofNullable(balance);
    }

    /**
     * SOBRESCRITA (OVERRIDE): Implementação da lógica da Interface.
     */
    @Override
    public void processPayment(double amount) throws InsufficientFundsException {
        if (status != CardStatus.ACTIVE) throw new InsufficientFundsException("Cartão Inativo");
        if (amount > balance) throw new InsufficientFundsException("Saldo insuficiente");
        this.balance -= amount;
    }

    /**
     * EQUALS/HASHCODE: O contrato fundamental para Coleções (Sets/Maps).
     * Essencial para que a Wallet identifique cartões duplicados pelo NÚMERO.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return number == card.number;
    }

    @Override
    public int hashCode() { return Objects.hash(number); }
}
