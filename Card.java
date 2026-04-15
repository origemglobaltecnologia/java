import java.util.Objects;
import java.util.Optional;

public abstract class Card implements PaymentProcessor {
    private long number;
    private double balance;
    private CardStatus status;

    public Card(long number) {
        this.number = number;
        this.status = CardStatus.ACTIVE;
        this.balance = 0.0;
    }

    // O método que estava faltando para a Wallet!
    public long getNumber() {
        return this.number;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public Optional<Double> getBalance() {
        return Optional.ofNullable(balance);
    }

    @Override
    public void processPayment(double amount) throws InsufficientFundsException {
        if (status != CardStatus.ACTIVE) throw new InsufficientFundsException("Cartão Inativo");
        if (amount > balance) throw new InsufficientFundsException("Saldo insuficiente");
        this.balance -= amount;
    }

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
