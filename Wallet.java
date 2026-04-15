import java.util.HashSet;
import java.util.Set;

/**
 * SET (HashSet): Coleção que NÃO permite duplicatas.
 * Para estudos: Depende diretamente do equals() e hashCode() da classe Card.
 */
public class Wallet {
    private Set<Card> cards = new HashSet<>();

    public void addCard(Card card) {
        // cards.add retorna false se o item já existir (baseado no hashCode/equals)
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
