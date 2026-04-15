public class Mastercard extends Card {
    public Mastercard(long number) {
        super(number);
    }
    @Override
    public String toString() { return "[MASTERCARD] No: " + getNumber(); }
}
