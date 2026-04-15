public class Visa extends Card {
    public Visa(long number) {
        super(number);
    }
    @Override
    public String toString() { return "[VISA] No: " + getNumber(); }
}
