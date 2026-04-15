public class Visa extends Card {
    public Visa(long number) {
        super(number); // Chamada obrigatória ao construtor pai
    }
    
    @Override
    public String toString() { return "[VISA] No: " + getNumber(); }
}
