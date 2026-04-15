import java.util.HashSet;
import java.util.Set;

public class Wallet {
    private Set<Card> cards = new HashSet<>();

    public void addCard(Card card) {
        if (cards.add(card)) {
            System.out.println("SUCESSO: Cartão " + card.getNumber() + " adicionado.");
        } else {
            System.out.println("ERRO: O cartão " + card.getNumber() + " já existe na carteira!");
        }
    }

    public void listCards() {
        System.out.println("\n--- Meus Cartões ---");
        cards.forEach(System.out::println);
    }
}
