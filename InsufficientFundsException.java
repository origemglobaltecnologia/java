/**
 * EXCEPTION: Herda de 'Exception' (Checked Exception).
 * Para estudos: O compilador obriga quem chama a tratar (try-catch) ou relançar (throws).
 * Tecnologia: Utilizada para sinalizar erros de lógica de negócio.
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message); // Passa a mensagem para a classe pai Exception
    }
}
