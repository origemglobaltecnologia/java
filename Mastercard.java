/**
 * HERANÇA (extends): Mastercard É UM Card.
 * Para estudos: Reutiliza código da classe pai.
 */
public class Mastercard extends Card {
    public Mastercard(long number) {
        super(number); // Chama o construtor da classe pai (Card)
    }
    
    @Override
    public String toString() { return "[MASTERCARD] No: " + getNumber(); }
}
